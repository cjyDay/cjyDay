package com.bat.crm.mapper;


import com.bat.crm.entity.Department;
import com.bat.crm.entity.Employee;
import com.bat.crm.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DepartmentMapper {


    //查询所有
    List<Department> selectDepartment();






}
