package com.four.service;

import com.four.entity.Drug;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 药品(Drug)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:25:56
 */
public interface DrugService {

    /**
     * 通过ID查询单条数据
     *
     * @param drugId 主键
     * @return 实例对象
     */
    Drug queryById(Integer drugId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Drug> queryAllByLimit(int offset, int limit);



    PageInfo<Drug> showDrugByType(int pageNum, int pageSize,String drugType);
    /**
     * 新增数据
     *
     * @param drug 实例对象
     * @return 实例对象
     */
    Drug insert(Drug drug);

    /**
     * 修改数据
     *
     * @param drug 实例对象
     * @return 实例对象
     */
    Drug update(Drug drug);

    /**
     * 通过主键删除数据
     *
     * @param drugId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drugId);

}