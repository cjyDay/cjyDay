package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Customer;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.CustomerVoMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.CustomerVoService;
import com.bat.crm.vo.CustomerVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CustomerVoServiceImpl implements CustomerVoService {

    @Resource
    private CustomerVoMapper customerVoMapper;


    public int delCustomerVo(int customerId) {
        return customerVoMapper.delCustomerVo(customerId);
    }

    public int insertCustomerVo(Customer customer) {
        return customerVoMapper.insertCustomerVo(customer);
    }

    public CustomerVo selectByPrimaryKeyCustomerVo(Integer customerId) {
        return customerVoMapper.selectByPrimaryKeyCustomerVo(customerId);
    }

    public List<CustomerVo> selectCustomerVo() {
        return customerVoMapper.selectCustomerVo();
    }

    public List<CustomerVo> selectCustomerVoKeyName(String customerName) {
        return customerVoMapper.selectCustomerVoKeyName(customerName);
    }

    public int updateCustomerVo(Customer customer) {
        return customerVoMapper.updateCustomerVo(customer);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<CustomerVo> list = customerVoMapper.selectCustomerVo();
        PageInfo<CustomerVo> pageInfo = new PageInfo<CustomerVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }



}
