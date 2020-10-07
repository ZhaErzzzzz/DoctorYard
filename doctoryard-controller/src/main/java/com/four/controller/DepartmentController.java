package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.Department;
import com.four.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 科室(Department)表控制层
 *
 * @author makejava
 * @since 2020-10-06 11:37:12
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Reference
    private DepartmentService departmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Department selectOne(Integer id) {
        return this.departmentService.queryById(id);
    }

    @GetMapping("selectDepartmentId")
    public List<Integer> queryByDepartmentName(String departmentName){
      return   departmentService.queryDepartmentIdByDepartmentName(departmentName);
    }

}