package com.four.service.impl;

import com.four.dao.ListsDao;
import com.four.entity.Lists;
import com.four.entity.OrderVo;
import com.four.service.ListsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 总订单(Lists)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 16:48:58
 */
@Service
@Component
public class ListsServiceImpl implements ListsService {
    @Autowired
    private ListsDao listsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    @Override
    public Lists queryById(Integer listId) {
        return this.listsDao.queryById(listId);
    }

    @Override
    public List<Lists> queryByUserId(Integer userId) {
        return listsDao.queryByUserId(userId);
    }

    @Override
    public List<Integer> queryListIdByUserId(Integer userId) {
        return listsDao.queryListIdByUserId(userId);
    }

    @Override
    public List<Integer> queryAddressIdByUserId(Integer userId) {
        return listsDao.queryAddressIdByUserId(userId);
    }

    @Override
    public Integer queryAddressIdByListId(Integer listId) {
        return listsDao.queryAddressIdByListId(listId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Lists> queryAllByLimit(int offset, int limit) {
        return this.listsDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<OrderVo> queryInformation(int userId) {
        return listsDao.queryInformation(userId);
    }

    /**
     * 新增数据
     *
     * @param lists 实例对象
     * @return 实例对象
     */
    @Override
    public Lists insert(Lists lists) {
        this.listsDao.insert(lists);
        return lists;
    }

    /**
     * 修改数据
     *
     * @param lists 实例对象
     * @return 实例对象
     */
    @Override
    public Lists update(Lists lists) {
        this.listsDao.update(lists);
        return this.queryById(lists.getListId());
    }

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer listId) {
        return this.listsDao.deleteById(listId) > 0;
    }
}