package com.four.dao;

import com.four.entity.OrderDrug;
import com.four.entity.OrderDrugVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 加入购物车的药品(OrderDrug)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:15
 */
@Mapper
@Repository
public interface OrderDrugDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderDrugId 主键
     * @return 实例对象
     */
    OrderDrug queryById(Integer orderDrugId);

    @Select("SELECT * FROM (SELECT order_drug.order_drug_id,order_drug.drug_id,order_drug.user_id,order_drug.order_drug_status,order_drug.order_drug_count,drug.drug_name,drug.drug_price FROM drug,order_drug WHERE drug.drug_id=order_drug.drug_id) a  WHERE a.user_id=#{userId}")
    List<OrderDrugVo>  queryByUserId(Integer userId);

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

    @Insert("insert into order_drug(drug_id,user_id,order_drug_status,order_drug_count) values(#{drugId},#{userId},#{orderDrugStatus},#{orderDrugCount})")
    int insertOrder(OrderDrug orderDrug);

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