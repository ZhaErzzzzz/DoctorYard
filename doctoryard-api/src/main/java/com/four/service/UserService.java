package com.four.service;

import com.four.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户(User)表服务接口
 *
 * @author makejava
 * @since 2020-10-05 16:29:12
 */
public interface UserService {
    /**
     * 通过Name查询单条数据
     *
     * @param userName 主键
     * @return 实例对象
     */
    User queryByName(String userName);
    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Integer userId);
    Integer updateImg(String userImg,Integer userId);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}