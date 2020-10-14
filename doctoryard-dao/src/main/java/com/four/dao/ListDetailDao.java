package com.four.dao;

import com.four.entity.ListDetail;
import com.four.entity.OrderDetailVo;
import com.four.entity.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单详情(ListDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-07 19:15:26
 */
@Mapper
@Repository
public interface ListDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param listDetailId 主键
     * @return 实例对象
     */

    ListDetail queryById(Integer listDetailId);

    @Select("select * from list_detail where list_id=#{listId}")
    List<ListDetail> queryByListId(Integer listId);

    @Select("select drug_id from list_detail where list_id=#{listId}")
    List<Integer> queryDrugIdByListId(Integer listId);

    @Select("select list_detail_id from list_detail where list_id=#{listId}")
    List<Integer> queryListDetailIdByListId(Integer listId);

    @Select("select drug_id from list_detail where list_detail_id=#{listDetailId}")
    Integer queryDrugIdByListDetailId(Integer listDetailId);

    @Select("SELECT * FROM (SELECT list_detail.list_detail_id,list_detail.list_id,list_detail.drug_id,list_detail.list_detail_count,list_detail.list_detail_price,drug.drug_kinds,drug.drug_num,drug.drug_name,drug.drug_price,drug.drug_describe,drug.drug_type FROM list_detail JOIN drug WHERE list_detail.drug_id=drug.drug_id) a WHERE a.list_id=#{listId}")
    List<OrderDetailVo> queryDetailByListId(Integer listId);

    @Select("SELECT * FROM (SELECT register.register_id,register.user_id,register.doctor_id,doctor.doctor_lastname,register.regist_pay_id,register.register_day,register.register_time,register.register_status,regist_pay.regist_pay_price,regist_pay.regist_pay_status FROM register ,doctor, regist_pay WHERE register.regist_pay_id=regist_pay.regist_pay_id AND register.doctor_id=doctor.doctor_id )a WHERE a.user_id=#{userId}")
    List<RegisterVo> queryRegisterVoByUserId(Integer userId);



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ListDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param listDetail 实例对象
     * @return 对象列表
     */
    List<ListDetail> queryAll(ListDetail listDetail);

    /**
     * 新增数据
     *
     * @param listDetail 实例对象
     * @return 影响行数
     */
    int insert(ListDetail listDetail);

    /**
     * 修改数据
     *
     * @param listDetail 实例对象
     * @return 影响行数
     */
    int update(ListDetail listDetail);

    /**
     * 通过主键删除数据
     *
     * @param listDetailId 主键
     * @return 影响行数
     */
    int deleteById(Integer listDetailId);

}