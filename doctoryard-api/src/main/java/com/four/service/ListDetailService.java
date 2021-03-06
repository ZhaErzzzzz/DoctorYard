package com.four.service;

import com.four.entity.ListDetail;
import com.four.entity.OrderDetailVo;
import com.four.entity.RegisterVo;

import java.util.List;

/**
 * 订单详情(ListDetail)表服务接口
 *
 * @author makejava
 * @since 2020-10-07 19:15:54
 */
public interface ListDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param listDetailId 主键
     * @return 实例对象
     */
    ListDetail queryById(Integer listDetailId);

   List <ListDetail> queryByListId(Integer listId);

   List<Integer> queryDrugIdByListId(Integer listId);

   List<Integer> queryListDetailIdByListId(Integer listId);

   Integer queryDrugIdByListDetailId(Integer listDetailId);

   List<OrderDetailVo> queryDetailByListId(Integer listId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ListDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param listDetail 实例对象
     * @return 实例对象
     */
    ListDetail insert(ListDetail listDetail);

    /**
     * 修改数据
     *
     * @param listDetail 实例对象
     * @return 实例对象
     */
    ListDetail update(ListDetail listDetail);

    /**
     * 通过主键删除数据
     *
     * @param listDetailId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer listDetailId);


    List<RegisterVo> queryRegisterVoByUserId(Integer userId);

}