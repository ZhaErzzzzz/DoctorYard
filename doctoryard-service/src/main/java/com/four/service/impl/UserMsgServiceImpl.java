package com.four.service.impl;

import com.four.dao.UserMsgDao;
import com.four.entity.UserMsg;
import com.four.service.UserMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收藏文章(UserMsg)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:35:15
 */
@Service("userMsgService")
public class UserMsgServiceImpl implements UserMsgService {
    @Resource
    private UserMsgDao userMsgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userMsgId 主键
     * @return 实例对象
     */
    @Override
    public UserMsg queryById(Integer userMsgId) {
        return this.userMsgDao.queryById(userMsgId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserMsg> queryAllByLimit(int offset, int limit) {
        return this.userMsgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userMsg 实例对象
     * @return 实例对象
     */
    @Override
    public UserMsg insert(UserMsg userMsg) {
        this.userMsgDao.insert(userMsg);
        return userMsg;
    }

    /**
     * 修改数据
     *
     * @param userMsg 实例对象
     * @return 实例对象
     */
    @Override
    public UserMsg update(UserMsg userMsg) {
        this.userMsgDao.update(userMsg);
        return this.queryById(userMsg.getUserMsgId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userMsgId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userMsgId) {
        return this.userMsgDao.deleteById(userMsgId) > 0;
    }
}