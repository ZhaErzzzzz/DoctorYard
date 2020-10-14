package com.four.dao;

import com.four.entity.Realinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 真实信息(Realinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-07 19:20:53
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
    @Select("select * from realinfo where realinfo_id=#{realinfoId}")
    Realinfo queryById(Integer realinfoId);

    /**
     * 通过外键查询
     * @param  userId 外键
     */
    @Select("select * from realinfo where user_id=#{userId}")
    Realinfo queryByUserId(Integer userId);

   @Insert(" insert into realinfo (realinfo_name,realinfo_tel,realinfo_birthday,realinfo_img,realinfo_bloodtype,realinfo_idcard,realinfo_worktype,realinfo_company,realinfo_married,realinfo_location,realinfo_oldlocation," +
           "user_id,realinfo_sex) values(#{realinfoName},#{realinfoTel},#{realinfoBirthday},#{realinfoImg},#{realinfoBloodtype},#{realinfoIdcard},#{realinfoWorktype},#{realinfoCompany},#{realinfoMarried},#{realinfoLocation},#{realinfoOldlocation},#{userId},#{realinfoSex})")
    Integer addRealinfo(Realinfo realinfo);
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
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Realinfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Realinfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Realinfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Realinfo> entities);

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