package com.four.dao;

import com.four.entity.Realinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 真实信息(Realinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:24
 */
@Mapper
@Repository
public interface RealinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param realinfoId 主键
     * @return 实例对象
     */
    Realinfo queryById(Integer realinfoId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Realinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param realinfo 实例对象
     * @return 对象列表
     */
    List<Realinfo> queryAll(Realinfo realinfo);

    /**
     * 新增数据
     *
     * @param realinfo 实例对象
     * @return 影响行数
     */
    int insert(Realinfo realinfo);

    /**
     * 修改数据
     *
     * @param realinfo 实例对象
     * @return 影响行数
     */
    int update(Realinfo realinfo);

    /**
     * 通过主键删除数据
     *
     * @param realinfoId 主键
     * @return 影响行数
     */
    int deleteById(Integer realinfoId);

}