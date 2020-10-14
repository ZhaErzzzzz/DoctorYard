package com.four.dao;

import com.four.entity.Heathyfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 健康档案(Heathyfile)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:23:38
 */
@Mapper
@Repository
public interface HeathyfileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param heathyfileId 主键
     * @return 实例对象
     */
    @Select("select * from heathyfile where heathyfile_id=#{heathyfileId}")
    Heathyfile queryById(Integer heathyfileId);

    @Select("select * from  heathyfile where realinfo_id=#{realinfoId} ORDER BY heathyfile_creatdate DESC")
    List<Heathyfile> queryByRealinfoId(Integer realinfoId);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Heathyfile> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param heathyfile 实例对象
     * @return 对象列表
     */
    List<Heathyfile> queryAll(Heathyfile heathyfile);

    /**
     * 新增数据
     *
     * @param heathyfile 实例对象
     * @return 影响行数
     */
    int insert(Heathyfile heathyfile);

    /**
     * 修改数据
     *
     * @param heathyfile 实例对象
     * @return 影响行数
     */
    int update(Heathyfile heathyfile);

    /**
     * 通过主键删除数据
     *
     * @param heathyfileId 主键
     * @return 影响行数
     */
    int deleteById(Integer heathyfileId);

}