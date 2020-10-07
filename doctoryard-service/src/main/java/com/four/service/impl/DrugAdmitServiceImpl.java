package com.four.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.four.dao.DrugAdmitDao;
import com.four.entity.DrugAdmit;
import com.four.service.DrugAdmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户可购处方药(DrugAdmit)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 17:01:12
 */
//@Service("drugAdmitService")
@Service
@Component
public class DrugAdmitServiceImpl implements DrugAdmitService {
    @Autowired
    private DrugAdmitDao drugAdmitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param drugAdmitId 主键
     * @return 实例对象
     */
    @Override
    public DrugAdmit queryById(Integer drugAdmitId) {
        return this.drugAdmitDao.queryById(drugAdmitId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DrugAdmit> queryAllByLimit(int offset, int limit) {
        return this.drugAdmitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param drugAdmit 实例对象
     * @return 实例对象
     */
    @Override
    public DrugAdmit insert(DrugAdmit drugAdmit) {
        this.drugAdmitDao.insert(drugAdmit);
        return drugAdmit;
    }

    /**
     * 修改数据
     *
     * @param drugAdmit 实例对象
     * @return 实例对象
     */
    @Override
    public DrugAdmit update(DrugAdmit drugAdmit) {
        this.drugAdmitDao.update(drugAdmit);
        return this.queryById(drugAdmit.getDrugAdmitId());
    }

    /**
     * 通过主键删除数据
     *
     * @param drugAdmitId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drugAdmitId) {
        return this.drugAdmitDao.deleteById(drugAdmitId) > 0;
    }
}