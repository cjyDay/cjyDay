package com.bat.crm.mapper;


import com.bat.crm.entity.Employee;
import com.bat.crm.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeVoMapper {



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


}
