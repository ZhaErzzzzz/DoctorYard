package com.four.service.impl;

import com.four.dao.ListDetailDao;
import com.four.entity.ListDetail;
import com.four.service.ListDetailService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单详情(ListDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:34:09
 */
@Service
@Component
public class ListDetailServiceImpl implements ListDetailService {
    @Autowired
    private ListDetailDao listDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param listDetailId 主键
     * @return 实例对象
     */
    @Override
    public ListDetail queryById(Integer listDetailId) {
        return this.listDetailDao.queryById(listDetailId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ListDetail> queryAllByLimit(int offset, int limit) {
        return this.listDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param listDetail 实例对象
     * @return 实例对象
     */
    @Override
    public ListDetail insert(ListDetail listDetail) {
        this.listDetailDao.insert(listDetail);
        return listDetail;
    }

    /**
     * 修改数据
     *
     * @param listDetail 实例对象
     * @return 实例对象
     */
    @Override
    public ListDetail update(ListDetail listDetail) {
        this.listDetailDao.update(listDetail);
        return this.queryById(listDetail.getListDetailId());
    }

    /**
     * 通过主键删除数据
     *
     * @param listDetailId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer listDetailId) {
        return this.listDetailDao.deleteById(listDetailId) > 0;
    }
}