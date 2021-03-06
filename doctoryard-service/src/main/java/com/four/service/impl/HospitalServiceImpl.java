package com.four.service.impl;

import com.four.dao.DoctorDao;
import com.four.dao.HospitalDao;
import com.four.entity.Hospital;
import com.four.service.HospitalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 医院(Hospital)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 11:36:03
 */
@Service
@Component
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalDao hospitalDao;
    @Autowired
    private DoctorDao doctorDao;
    /**
     * 通过ID查询单条数据
     *
     * @param hospitalId 主键
     * @return 实例对象
     */
    @Override
    public Hospital queryById(Integer hospitalId) {
        return this.hospitalDao.queryById(hospitalId);
    }

    @Override
    public Hospital queryByName(String hospitalName) {
        return hospitalDao.queryByName(hospitalName);
    }

    @Override
    public Integer queryByName1(String hospitalName) {
        return hospitalDao.queryByName1(hospitalName);
    }

    @Override
    public PageInfo<Hospital> showAllHospital(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Hospital> list = hospitalDao.queryAll();
        PageInfo<Hospital> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hospital> queryAllByLimit(int offset, int limit) {
        return this.hospitalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    @Override
    public Hospital insert(Hospital hospital) {
        this.hospitalDao.insert(hospital);
        return hospital;
    }

    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    @Override
    public Hospital update(Hospital hospital) {
        this.hospitalDao.update(hospital);
        return this.queryById(hospital.getHospitalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param hospitalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer hospitalId) {
        return this.hospitalDao.deleteById(hospitalId) > 0;
    }
}