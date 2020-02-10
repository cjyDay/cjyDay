package com.bat.crm.service.impl;


import com.bat.crm.entity.Department;
import com.bat.crm.entity.Employee;
import com.bat.crm.mapper.DepartmentMapper;
import com.bat.crm.mapper.EmployeeVoMapper;
import com.bat.crm.service.DepartmentService;
import com.bat.crm.service.EmployeeVoService;
import com.bat.crm.vo.EmployeeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;


    public List<Department> selectDepartment() {
        return departmentMapper.selectDepartment();
    }
}
