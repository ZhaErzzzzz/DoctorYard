package com.four.service.impl;

import com.four.dao.HeathyfileDao;
import com.four.entity.Heathyfile;
import com.four.service.HeathyfileService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 健康档案(Heathyfile)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:32:00
 */
@Service
@Component
public class HeathyfileServiceImpl implements HeathyfileService {
    @Autowired
    private HeathyfileDao heathyfileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param heathyfileId 主键
     * @return 实例对象
     */
    @Override
    public Heathyfile queryById(Integer heathyfileId) {
        return this.heathyfileDao.queryById(heathyfileId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Heathyfile> queryAllByLimit(int offset, int limit) {
        return this.heathyfileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param heathyfile 实例对象
     * @return 实例对象
     */
    @Override
    public Heathyfile insert(Heathyfile heathyfile) {
        this.heathyfileDao.insert(heathyfile);
        return heathyfile;
    }

    /**
     * 修改数据
     *
     * @param heathyfile 实例对象
     * @return 实例对象
     */
    @Override
    public Heathyfile update(Heathyfile heathyfile) {
        this.heathyfileDao.update(heathyfile);
        return this.queryById(heathyfile.getHeathyfileId());
    }

    /**
     * 通过主键删除数据
     *
     * @param heathyfileId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer heathyfileId) {
        return this.heathyfileDao.deleteById(heathyfileId) > 0;
    }
}