package com.four.service;

import com.four.entity.Heathyfile;

import java.util.List;

/**
 * 健康档案(Heathyfile)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:26:23
 */
public interface HeathyfileService {

    /**
     * 通过ID查询单条数据
     *
     * @param heathyfileId 主键
     * @return 实例对象
     */
    Heathyfile queryById(Integer heathyfileId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Heathyfile> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param heathyfile 实例对象
     * @return 实例对象
     */
    Heathyfile insert(Heathyfile heathyfile);

    /**
     * 修改数据
     *
     * @param heathyfile 实例对象
     * @return 实例对象
     */
    Heathyfile update(Heathyfile heathyfile);

    /**
     * 通过主键删除数据
     *
     * @param heathyfileId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer heathyfileId);

}