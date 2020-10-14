package com.four.service.impl;

import com.four.dao.RegisterDao;
import com.four.entity.Register;
import com.four.service.RegisterService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 挂号(Register)表服务实现类
 *
 * @author makejava
 * @since 2020-10-07 19:17:50
 */
@Service
@Component
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param registerId 主键
     * @return 实例对象
     */
    @Override
    public Register queryById(Integer registerId) {
        return this.registerDao.queryById(registerId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Register> queryAllByLimit(int offset, int limit) {
        return this.registerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param register 实例对象
     * @return 实例对象
     */
    @Override
    public Register insert(Register register) {
        this.registerDao.insert(register);
        return register;
    }

    /**
     * 修改数据
     *
     * @param register 实例对象
     * @return 实例对象
     */
    @Override
    public Register update(Register register) {
        this.registerDao.update(register);
        return this.queryById(register.getRegisterId());
    }

    /**
     * 通过主键删除数据
     *
     * @param registerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer registerId) {
        return this.registerDao.deleteById(registerId) > 0;
    }
}