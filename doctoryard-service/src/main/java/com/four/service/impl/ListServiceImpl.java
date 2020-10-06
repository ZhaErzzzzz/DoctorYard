package com.four.service.impl;

import com.four.dao.ListDao;
import com.four.entity.List;
import com.four.service.ListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 总订单(List)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:32:08
 */
@Service("listService")
public class ListServiceImpl implements ListService {
    @Resource
    private ListDao listDao;

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    @Override
    public List queryById(Integer listId) {
        return this.listDao.queryById(listId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<List> queryAllByLimit(int offset, int limit) {
        return this.listDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param list 实例对象
     * @return 实例对象
     */
    @Override
    public List insert(List list) {
        this.listDao.insert(list);
        return list;
    }

    /**
     * 修改数据
     *
     * @param list 实例对象
     * @return 实例对象
     */
    @Override
    public List update(List list) {
        this.listDao.update(list);
        return this.queryById(list.getListId());
    }

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer listId) {
        return this.listDao.deleteById(listId) > 0;
    }
}