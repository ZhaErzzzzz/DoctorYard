package com.four.service.impl;

import com.four.dao.UserDao;
import com.four.entity.User;
import com.four.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户(User)表服务实现类
 *
 * @author makejava
 * @since 2020-10-07 18:59:16
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 通过Name查询单条数据
     *
     * @param userName 主键
     * @return 实例对象
     */
    @Override
    public User queryByName(String userName) {
        return userDao.queryByName(userName);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer userId) {
        return this.userDao.queryById(userId);
    }

    @Override
    public Integer updateImg(String userImg, Integer userId) {
      return   this.userDao.updateImg(userImg,userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.userDao.deleteById(userId) > 0;
    }
}