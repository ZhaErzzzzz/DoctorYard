package com.four.service;

import com.four.entity.Department;

import java.util.List;

/**
 * 科室(Department)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 11:35:16
 */
public interface DepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    Department queryById(Integer departmentId);

    Integer queryDepartmentNumByHospitalId(Integer hospitalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Department> queryAllByLimit(int offset, int limit);


    List<Department>  queryByType();

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department insert(Department department);

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department update(Department department);

    /**
     * 通过主键删除数据
     *
     * @param departmentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer departmentId);

    //通过科室名字查所有科室id
    List<Integer> queryDepartmentIdByDepartmentName(String departmentName);
}