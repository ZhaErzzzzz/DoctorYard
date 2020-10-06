package com.four.service.impl;

import com.four.dao.RegistPayDao;
import com.four.entity.RegistPay;
import com.four.service.RegistPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 挂号单(RegistPay)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:34:40
 */
@Service("registPayService")
public class RegistPayServiceImpl implements RegistPayService {
    @Resource
    private RegistPayDao registPayDao;

    /**
     * 通过ID查询单条数据
     *
     * @param registPayId 主键
     * @return 实例对象
     */
    @Override
    public RegistPay queryById(Integer registPayId) {
        return this.registPayDao.queryById(registPayId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<RegistPay> queryAllByLimit(int offset, int limit) {
        return this.registPayDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param registPay 实例对象
     * @return 实例对象
     */
    @Override
    public RegistPay insert(RegistPay registPay) {
        this.registPayDao.insert(registPay);
        return registPay;
    }

    /**
     * 修改数据
     *
     * @param registPay 实例对象
     * @return 实例对象
     */
    @Override
    public RegistPay update(RegistPay registPay) {
        this.registPayDao.update(registPay);
        return this.queryById(registPay.getRegistPayId());
    }

    /**
     * 通过主键删除数据
     *
     * @param registPayId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer registPayId) {
        return this.registPayDao.deleteById(registPayId) > 0;
    }
}