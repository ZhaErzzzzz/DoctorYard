package com.four.dao;

import com.four.entity.OrderDrug;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 加入购物车的药品(OrderDrug)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:15
 */
public interface OrderDrugDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderDrugId 主键
     * @return 实例对象
     */
    OrderDrug queryById(Integer orderDrugId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderDrug> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderDrug 实例对象
     * @return 对象列表
     */
    List<OrderDrug> queryAll(OrderDrug orderDrug);

    /**
     * 新增数据
     *
     * @param orderDrug 实例对象
     * @return 影响行数
     */
    int insert(OrderDrug orderDrug);

    /**
     * 修改数据
     *
     * @param orderDrug 实例对象
     * @return 影响行数
     */
    int update(OrderDrug orderDrug);

    /**
     * 通过主键删除数据
     *
     * @param orderDrugId 主键
     * @return 影响行数
     */
    int deleteById(Integer orderDrugId);

}