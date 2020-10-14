package com.four.service;

import com.four.entity.OrderDrug;
import com.four.entity.OrderDrugVo;

import java.util.List;

/**
 * 加入购物车的药品(OrderDrug)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:27:38
 */
public interface OrderDrugService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderDrugId 主键
     * @return 实例对象
     */
    OrderDrug queryById(Integer orderDrugId);

    List<OrderDrugVo>  queryByUserId(Integer userId);


    void insertOrder(OrderDrug orderDrug);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderDrug> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderDrug 实例对象
     * @return 实例对象
     */
    OrderDrug insert(OrderDrug orderDrug);

    /**
     * 修改数据
     *
     * @param orderDrug 实例对象
     * @return 实例对象
     */
    OrderDrug update(OrderDrug orderDrug);

    /**
     * 通过主键删除数据
     *
     * @param orderDrugId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderDrugId);

}