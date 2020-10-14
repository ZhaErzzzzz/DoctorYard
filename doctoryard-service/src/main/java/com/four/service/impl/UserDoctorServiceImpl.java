package com.four.service.impl;

import com.four.dao.UserDoctorDao;
import com.four.entity.UserDoctor;
import com.four.service.UserDoctorService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收藏医生(UserDoctor)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:35:08
 */
@Service
@Component
public class UserDoctorServiceImpl implements UserDoctorService {
    @Autowired
    private UserDoctorDao userDoctorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userDoctorId 主键
     * @return 实例对象
     */
    @Override
    public UserDoctor queryById(Integer userDoctorId) {
        return this.userDoctorDao.queryById(userDoctorId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserDoctor> queryAllByLimit(int offset, int limit) {
        return this.userDoctorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userDoctor 实例对象
     * @return 实例对象
     */
    @Override
    public UserDoctor insert(UserDoctor userDoctor) {
        this.userDoctorDao.insert(userDoctor);
        return userDoctor;
    }

    /**
     * 修改数据
     *
     * @param userDoctor 实例对象
     * @return 实例对象
     */
    @Override
    public UserDoctor update(UserDoctor userDoctor) {
        this.userDoctorDao.update(userDoctor);
        return this.queryById(userDoctor.getUserDoctorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userDoctorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userDoctorId) {
        return this.userDoctorDao.deleteById(userDoctorId) > 0;
    }
}