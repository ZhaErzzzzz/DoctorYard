package com.four.service;

import com.four.entity.Realinfo;

import java.util.List;

/**
 * 真实信息(Realinfo)表服务接口
 *
 * @author makejava
 * @since 2020-10-07 19:21:19
 */
public interface RealinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param realinfoId 主键
     * @return 实例对象
     */
    Realinfo queryById(Integer realinfoId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Realinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param realinfo 实例对象
     * @return 实例对象
     */
    Realinfo insert(Realinfo realinfo);

    /**
     * 修改数据
     *
     * @param realinfo 实例对象
     * @return 实例对象
     */
    Realinfo update(Realinfo realinfo);

    /**
     * 通过主键删除数据
     *
     * @param realinfoId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer realinfoId);

}