package com.four.dao;

import com.four.entity.Msg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文章(Msg)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-07 19:27:42
 */
@Mapper
@Repository
public interface MsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param msgId 主键
     * @return 实例对象
     */
    @Select("select * from msg where msg_id=#{msgId}")
    Msg queryById(Integer msgId);

    @Select("select * from msg where msg_title=#{msgTitle}")
    Msg queryByMsgTitle(String msgTitle);

    @Select("select msg_id from msg where msg_title=#{msgTitle}")
    Integer queryMsgIdByMsgTitle(String msgTitle);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Msg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     * 就是分页查询
     *
     * @return 对象列表
     */
    @Select("select * from msg order by msg_id desc")
    List<Msg> queryAll();

    /**
     * 新增数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int insert(Msg msg);

    /**
     * 修改数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int update(Msg msg);

    /**
     * 通过主键删除数据
     *
     * @param msgId 主键
     * @return 影响行数
     */
    int deleteById(Integer msgId);

}