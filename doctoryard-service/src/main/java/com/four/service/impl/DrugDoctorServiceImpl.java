package com.four.service.impl;

import com.four.dao.DrugDoctorDao;
import com.four.entity.DrugDoctor;
import com.four.service.DrugDoctorService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 历史处方记录(DrugDoctor)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:31:36
 */
@Service
@Component
public class DrugDoctorServiceImpl implements DrugDoctorService {
    @Autowired
    private DrugDoctorDao drugDoctorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param drugDoctorId 主键
     * @return 实例对象
     */
    @Override
    public DrugDoctor queryById(Integer drugDoctorId) {
        return this.drugDoctorDao.queryById(drugDoctorId);
    }

    @Override
    public List<Integer> queryDrugIdByDoctorId(Integer doctorId) {
        return drugDoctorDao.queryDrugIdByDoctorId(doctorId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DrugDoctor> queryAllByLimit(int offset, int limit) {
        return this.drugDoctorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param drugDoctor 实例对象
     * @return 实例对象
     */
    @Override
    public DrugDoctor insert(DrugDoctor drugDoctor) {
        this.drugDoctorDao.insert(drugDoctor);
        return drugDoctor;
    }

    /**
     * 修改数据
     *
     * @param drugDoctor 实例对象
     * @return 实例对象
     */
    @Override
    public DrugDoctor update(DrugDoctor drugDoctor) {
        this.drugDoctorDao.update(drugDoctor);
        return this.queryById(drugDoctor.getDrugDoctorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param drugDoctorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drugDoctorId) {
        return this.drugDoctorDao.deleteById(drugDoctorId) > 0;
    }
}