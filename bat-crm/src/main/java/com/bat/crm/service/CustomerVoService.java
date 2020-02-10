package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Customer;
import com.bat.crm.vo.CustomerVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CustomerVoService {



    //删除
    int delCustomerVo(int customerId);


    //添加
    int insertCustomerVo(Customer customer);


    //单查询
    CustomerVo selectByPrimaryKeyCustomerVo(Integer customerId);

    //查询所有
    List<CustomerVo> selectCustomerVo();

    //根据客户姓名查询
    List<CustomerVo>selectCustomerVoKeyName(String customerName);


    //修改
    int updateCustomerVo(Customer customer);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);

}
