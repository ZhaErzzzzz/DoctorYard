package com.four.service.impl;

import com.four.dao.OrderDrugDao;
import com.four.entity.OrderDrug;
import com.four.service.OrderDrugService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 加入购物车的药品(OrderDrug)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:34:25
 */
@Service("orderDrugService")
public class OrderDrugServiceImpl implements OrderDrugService {
    @Resource
    private OrderDrugDao orderDrugDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderDrugId 主键
     * @return 实例对象
     */
    @Override
    public OrderDrug queryById(Integer orderDrugId) {
        return this.orderDrugDao.queryById(orderDrugId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderDrug> queryAllByLimit(int offset, int limit) {
        return this.orderDrugDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderDrug 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDrug insert(OrderDrug orderDrug) {
        this.orderDrugDao.insert(orderDrug);
        return orderDrug;
    }

    /**
     * 修改数据
     *
     * @param orderDrug 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDrug update(OrderDrug orderDrug) {
        this.orderDrugDao.update(orderDrug);
        return this.queryById(orderDrug.getOrderDrugId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderDrugId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderDrugId) {
        return this.orderDrugDao.deleteById(orderDrugId) > 0;
    }
}