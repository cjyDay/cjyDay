package com.bat.crm.service.impl;


import com.bat.crm.entity.Employee;

import com.bat.crm.mapper.EmployeeVoMapper;

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
public class EmployeeVoServiceImpl implements EmployeeVoService {

    @Resource
    private EmployeeVoMapper employeeVoMapper;


    public int  delEmployeeVo(int employeeId){
        return employeeVoMapper.delEmployeeVo(employeeId);
    }

    public int insertEmployeeVo(Employee employee) {
        return employeeVoMapper.insertEmployeeVo(employee);
    }

    public EmployeeVo selectByPrimaryKeyEmployeeVo(Integer employeeId) {
        return employeeVoMapper.selectByPrimaryKeyEmployeeVo(employeeId);
    }

    public List<EmployeeVo> selectEmployeeVo() {
        return employeeVoMapper.selectEmployeeVo();
    }

    public List<EmployeeVo> selectEmployeeVoKeyName(String departmentName) {
        return employeeVoMapper.selectEmployeeVoKeyName(departmentName);
    }

    public int updateEmployeeVo(Employee employee) {
        return employeeVoMapper.updateEmployeeVo(employee);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<EmployeeVo> listEmployeeVo = employeeVoMapper.selectEmployeeVo();
        PageInfo<EmployeeVo> pageInfo = new PageInfo<EmployeeVo>(listEmployeeVo);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }
}
