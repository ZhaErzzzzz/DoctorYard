package com.four.dao;

import com.four.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户(User)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-07 15:55:00
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 通过Name查询单条数据
     *
     * @param userName 主键
     * @return 实例对象
     */
    @Select("select * from user where user_name=#{userName}")
    User queryByName(String userName);

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Select("select * from user where user_id=#{userId}")
    User queryById(Integer userId);

    @Update("update user set user_img=#{userImg} where user_id=#{userId}")
    Integer updateImg(String userImg,Integer userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    @Insert("insert into user (user_name,user_pwd,user_tel,user_email,user_img,user_nickname) " +
            "values(#{user.userName},#{user.userPwd},#{user.userTel},#{user.userEmail},#{user.userImg},#{user.userNickname})")
    int insert(@Param("user") User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}