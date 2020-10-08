package com.four.service.impl;

import com.four.dao.DhonorDao;
import com.four.entity.Dhonor;
import com.four.service.DhonorService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 医生荣誉技能(Dhonor)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:29:11
 */
@Service
@Component
public class DhonorServiceImpl implements DhonorService {
    @Autowired
    private DhonorDao dhonorDao;


    /**
     * 通过ID查询单条数据
     *
     * @param dhonorId 主键
     * @return 实例对象
     */
    @Override
    public Dhonor queryById(Integer dhonorId) {
        return this.dhonorDao.queryById(dhonorId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dhonor> queryAllByLimit(int offset, int limit) {
        return this.dhonorDao.queryAllByLimit(offset, limit);
    }

    /**
     *
     * @param doctorId
     * @return
     */
    @Override
    public Dhonor queryByDoctorId(Integer doctorId) {
        return dhonorDao.queryByDoctorId(doctorId);
    }

    /**
     * 新增数据
     *
     * @param dhonor 实例对象
     * @return 实例对象
     */
    @Override
    public Dhonor insert(Dhonor dhonor) {
        this.dhonorDao.insert(dhonor);
        return dhonor;
    }

    /**
     * 修改数据
     *
     * @param dhonor 实例对象
     * @return 实例对象
     */
    @Override
    public Dhonor update(Dhonor dhonor) {
        this.dhonorDao.update(dhonor);
        return this.queryById(dhonor.getDhonorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param dhonorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer dhonorId) {
        return this.dhonorDao.deleteById(dhonorId) > 0;
    }
}