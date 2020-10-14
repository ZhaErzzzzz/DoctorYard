package com.four.service.impl;

import com.four.dao.RealinfoDao;
import com.four.entity.Realinfo;
import com.four.service.RealinfoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 真实信息(Realinfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:34:33
 */
@Service
@Component
public class RealinfoServiceImpl implements RealinfoService {
    @Autowired
    private RealinfoDao realinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param realinfoId 主键
     * @return 实例对象
     */
    @Override
    public Realinfo queryById(Integer realinfoId) {
        return this.realinfoDao.queryById(realinfoId);
    }

    @Override
    public Realinfo queryByUserId(Integer userId) {
        return this.realinfoDao.queryByUserId(userId);
    }

    @Override
    public Integer addRealinfo(Realinfo realinfo) {
        return this.realinfoDao.addRealinfo(realinfo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Realinfo> queryAllByLimit(int offset, int limit) {
        return this.realinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param realinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Realinfo insert(Realinfo realinfo) {
        this.realinfoDao.insert(realinfo);
        return realinfo;
    }

    /**
     * 修改数据
     *
     * @param realinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Realinfo update(Realinfo realinfo) {
        this.realinfoDao.update(realinfo);
        return this.queryById(realinfo.getRealinfoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param realinfoId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer realinfoId) {
        return this.realinfoDao.deleteById(realinfoId) > 0;
    }
}