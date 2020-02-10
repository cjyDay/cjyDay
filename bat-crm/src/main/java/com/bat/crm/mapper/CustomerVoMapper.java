package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.Employee;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerVoMapper {



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


}
