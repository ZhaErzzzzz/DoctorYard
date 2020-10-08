package com.four.service.impl;

import com.four.dao.DrugDao;
import com.four.entity.Drug;
import com.four.entity.Msg;
import com.four.service.DrugService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 药品(Drug)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:31:16
 */
@Service
@Component
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugDao drugDao;

    /**
     * 通过ID查询单条数据
     *
     * @param drugId 主键
     * @return 实例对象
     */
    @Override
    public Drug queryById(Integer drugId) {
        return this.drugDao.queryById(drugId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Drug> queryAllByLimit(int offset, int limit) {
        return this.drugDao.queryAllByLimit(offset, limit);
    }

    @Override
    public PageInfo<Drug> showDrugByType(int pageNum, int pageSize, String drugType) {
        PageHelper.startPage(pageNum, pageSize);
        List<Drug> list = drugDao.queryByType(drugType);
        PageInfo<Drug> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param drug 实例对象
     * @return 实例对象
     */
    @Override
    public Drug insert(Drug drug) {
        this.drugDao.insert(drug);
        return drug;
    }

    /**
     * 修改数据
     *
     * @param drug 实例对象
     * @return 实例对象
     */
    @Override
    public Drug update(Drug drug) {
        this.drugDao.update(drug);
        return this.queryById(drug.getDrugId());
    }

    /**
     * 通过主键删除数据
     *
     * @param drugId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drugId) {
        return this.drugDao.deleteById(drugId) > 0;
    }
}