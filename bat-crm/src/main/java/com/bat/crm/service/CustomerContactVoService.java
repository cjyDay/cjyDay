package com.bat.crm.service;

import com.bat.crm.entity.Customer;
import com.bat.crm.entity.CustomerContact;
import com.bat.crm.vo.CustomerContactVo;
import com.bat.crm.vo.CustomerVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CustomerContactVoService {


    //删除
    int delCustomerContactVo(int contactId);


    //添加
    int insertCustomerContactVo(CustomerContact customerContact);


    //单查询
    CustomerContactVo selectByPrimaryKeyCustomerContactVo(int contactId);

    //查询所有
    List<CustomerContactVo> selectCustomerContactVo();

    //根据客户姓名查询
    List<CustomerContactVo>selectCustomerContactVoKeyName(String customerName);
    //根据员工姓名查询
    List<CustomerContactVo>selectCustomerContactVoKeyEmployeeName(String employeeName);

    //修改
    int updateCustomerContactVo(CustomerContact customerContact);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);

}
