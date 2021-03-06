package com.four.service.impl;

import com.four.dao.DepartmentDao;
import com.four.entity.Department;
import com.four.service.DepartmentService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 科室(Department)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 11:36:18
 */
@Service
@Component
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    @Override
    public Department queryById(Integer departmentId) {
        return this.departmentDao.queryById(departmentId);
    }

    @Override
    public Integer queryDepartmentNumByHospitalId(Integer hospitalId) {
        return departmentDao.queryDepartmentNumByHospitalId(hospitalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Department> queryAllByLimit(int offset, int limit) {
        return this.departmentDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Department> queryByType() {
        return departmentDao.queryAllType();
    }

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department insert(Department department) {
        this.departmentDao.insert(department);
        return department;
    }

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department update(Department department) {
        this.departmentDao.update(department);
        return this.queryById(department.getDepartmentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param departmentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer departmentId) {
        return this.departmentDao.deleteById(departmentId) > 0;
    }

    @Override
    public List<Integer> queryDepartmentIdByDepartmentName(String departmentName) {
       return departmentDao.queryByDepartmentName(departmentName);
    }
}