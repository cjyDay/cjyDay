package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.CustomerContact;
import com.bat.crm.vo.CustomerContactVo;
import com.bat.crm.vo.CustomerVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerContactVoMapper {

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


}
