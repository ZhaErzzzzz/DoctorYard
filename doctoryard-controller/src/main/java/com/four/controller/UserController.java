package com.four.controller;

import com.alibaba.fastjson.JSONObject;
import com.four.entity.User;
import com.four.service.UserService;
import com.four.util.RedisUtil;
import com.four.util.Result;
import com.four.util.ResultCode;
import com.four.util.ResultFactory;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

/**
 * 用户(User)表控制层
 *
 * @author makejava
 * @since 2020-10-05 16:29:49
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Reference
    private UserService userService;
    @Autowired
    RedisUtil redisUtil;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    //登录
    @PostMapping("login")
    public Result login(@RequestBody User user){
       User u=userService.queryByName(user.getUserName());
        if(u==null){
            //账户错误
            return  ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"用户名或密码错误，请重新登录");
        }else{
            //1、验证密码
            boolean flag=BCrypt.checkpw(user.getUserPwd(),u.getUserPwd());

            if(!flag){
                //账号正确，密码错误
                return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"用户名或密码错误，请重新登录");
            }else {
                //2、账号正确，密码正确
                //3、生成token
                String token=BCrypt.hashpw(u.getUserPwd(),BCrypt.gensalt());
                //4、token存入redis
                redisUtil.set(token,u.getUserName(),24*60*60*1000);//1天
                //5、将token,存入data
                JSONObject data = new JSONObject();
                data.put("token",token);
                //6、将只包含d和username的对象,存入data
                User uu=new User();
                uu.setUserId(u.getUserId());
                uu.setUserName(u.getUserName());
                uu.setUserNickname(u.getUserNickname());
                uu.setUserImg(u.getUserImg());
                data.put("user",uu);
                //7、返回数据
                return ResultFactory.setResultSuccess(data);
            }

        }

    }
    //注册
    @PostMapping("signUp")
    public Result signUp(@RequestBody User user){
        User u = userService.queryByName(user.getUserName());
        if(u!=null){
            //用户名已存在
            return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"用户名已存在，请重新申请！");
        }else {
            user.setUserPwd(BCrypt.hashpw(user.getUserPwd(),BCrypt.gensalt()));
            user.setUserImg("小明.jpg");
            userService.insert(user);
            //注册成功
            return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_200,"注册成功,请登录后使用网站！");
        }
    }
}