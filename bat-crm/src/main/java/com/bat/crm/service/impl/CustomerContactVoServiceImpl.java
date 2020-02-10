package com.bat.crm.service.impl;

import com.bat.crm.entity.Customer;
import com.bat.crm.entity.CustomerContact;
import com.bat.crm.mapper.CustomerContactVoMapper;
import com.bat.crm.mapper.CustomerVoMapper;
import com.bat.crm.service.CustomerContactVoService;
import com.bat.crm.service.CustomerVoService;
import com.bat.crm.vo.CustomerContactVo;
import com.bat.crm.vo.CustomerVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CustomerContactVoServiceImpl implements CustomerContactVoService {

    @Resource
    private CustomerContactVoMapper customerContactVoMapper;


    public int delCustomerContactVo(int contactId) {
        return customerContactVoMapper.delCustomerContactVo(contactId);
    }

    public int insertCustomerContactVo(CustomerContact customerContact) {
        return customerContactVoMapper.insertCustomerContactVo(customerContact);
    }

    public CustomerContactVo selectByPrimaryKeyCustomerContactVo(int contactId) {
        return customerContactVoMapper.selectByPrimaryKeyCustomerContactVo(contactId);
    }

    public List<CustomerContactVo> selectCustomerContactVo() {
        return customerContactVoMapper.selectCustomerContactVo();
    }

    public List<CustomerContactVo> selectCustomerContactVoKeyName(String customerName) {
        return customerContactVoMapper.selectCustomerContactVoKeyName(customerName);
    }

    public List<CustomerContactVo> selectCustomerContactVoKeyEmployeeName(String employeeName) {
        return customerContactVoMapper.selectCustomerContactVoKeyEmployeeName(employeeName);
    }

    public int updateCustomerContactVo(CustomerContact customerContact) {
        return customerContactVoMapper.updateCustomerContactVo(customerContact);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<CustomerContactVo> list = customerContactVoMapper.selectCustomerContactVo();
        PageInfo<CustomerContactVo> pageInfo = new PageInfo<CustomerContactVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }



}
