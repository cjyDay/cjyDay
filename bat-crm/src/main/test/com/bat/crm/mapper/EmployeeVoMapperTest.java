package com.bat.crm.mapper;


import com.bat.crm.entity.Employee;
import com.bat.crm.vo.EmployeeVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeVoMapperTest {
    @Resource
    private  EmployeeVoMapper employeeVoMapper;


    @Test
    public void selectAllEmployeeVo() {
        System.out.println(employeeVoMapper.selectEmployeeVo());
    }
    @Test
    public void  selectEmployeeVoName(){
        System.out.println(employeeVoMapper.selectEmployeeVoKeyName("财务部"));
    }

    @Test
    public void updateAdmin(){
        Employee employee= new Employee();
        employee.setEmployeeName("czx");
        employee.setEmployeeSex("男");
        employee.setEmployeeJoinTime("2015-8-5");
        employee.setEmployeeDepartment(2);
        employee.setEmployeeId(1013);
        employeeVoMapper.updateEmployeeVo(employee);
    }

    @Test
    public void selectByPrimaryKeyEmployeeVo() {
        EmployeeVo employeeVo = employeeVoMapper.selectByPrimaryKeyEmployeeVo(1001);
        System.out.println(employeeVo);
    }
    @Test
    public void delEmployeeVo() {

        employeeVoMapper.delEmployeeVo(1013);
    }
    @Test
    public void insertEmployeeVo() {
        Employee employee= new Employee();
        employee.setEmployeeName("WW");
        employee.setEmployeeSex("男");
        employee.setEmployeeJoinTime("2020-02-08");
       employee.setEmployeeDepartment(6);

        employeeVoMapper.insertEmployeeVo(employee);
    }


}
