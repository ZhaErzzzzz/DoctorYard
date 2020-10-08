package com.four.security.token;

import com.four.dao.UserDao;
import com.four.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 认证成功
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    UserDao userDao;
    @Autowired
    RedisUtil redisUtil;

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        //生成token
        String username=((User)authentication.getPrincipal()).getUsername();
        String token= BCrypt.hashpw(username,BCrypt.gensalt("username"));

//        将token存入redis
        redisUtil.set(token,username,24*60*60*1000);//1天

//        将token返回
        response.setContentType("application/json;charset=UTF-8");
        response.addHeader("Authorization", "Bearer " + token);
        response.getWriter().print("用户token：" + token);
        response.getHeaders(token);
    }

    public static void main(String[] args) {
        String username="321";
        String token1= BCrypt.hashpw(username,BCrypt.gensalt());
        String token2= BCrypt.hashpw(username,BCrypt.gensalt());
        String token3= BCrypt.hashpw(username,BCrypt.gensalt());
        System.out.println(token1);
        System.out.println(BCrypt.checkpw(username,token1));
        System.out.println(token2);
        System.out.println(BCrypt.checkpw(username,token2));


        System.out.println(token3);
        System.out.println(BCrypt.checkpw(username,token3));
    }
}