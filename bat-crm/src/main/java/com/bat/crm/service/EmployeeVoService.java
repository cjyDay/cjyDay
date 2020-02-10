package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Employee;
import com.bat.crm.vo.EmployeeVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeVoService {


    //删除
    int delEmployeeVo(int employeeId);


    //添加
    int insertEmployeeVo(Employee employee);


    //单查询
    EmployeeVo selectByPrimaryKeyEmployeeVo(Integer employeeId);

    //查询所有
    List<EmployeeVo> selectEmployeeVo();

    //根据部门查询员工
    List<EmployeeVo>selectEmployeeVoKeyName(String departmentName);


    //修改
    int updateEmployeeVo(Employee employee);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
