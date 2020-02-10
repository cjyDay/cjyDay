package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.Employee;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.EmployeeVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerVoMapperTest {
    @Resource
    private  CustomerVoMapper customerVoMapper;


    @Test
    public void selectCustomerVo() {
        System.out.println(customerVoMapper.selectCustomerVo());
    }
    @Test
    public void  selectCustomerVoKeyName(){
        System.out.println(customerVoMapper.selectCustomerVoKeyName("敬曦"));
    }

    @Test
    public void updateAdmin(){
        Customer customer= new Customer();
         customer.setCustomerName("SS");
         customer.setCustomerAge("15");
         customer.setCustomerSex("N");
         customer.setCustomerState("DD");
         customer.setCustomerLocation(1);
         customer.setCustomerReference(1001);
         customer.setCustomerId(11);
        customerVoMapper.updateCustomerVo(customer);
    }

    @Test
    public void selectByPrimaryKeyCustomerVo() {
        CustomerVo customerVo = customerVoMapper.selectByPrimaryKeyCustomerVo(1);
        System.out.println(customerVo);
    }
    @Test
    public void delCustomerVo() {

        System.out.println(customerVoMapper.delCustomerVo(11));
    }
    @Test
    public void insertEmployeeVo() {
        Customer customer= new Customer();
        customer.setCustomerName("SS");
        customer.setCustomerAge("AA");
        customer.setCustomerSex("WW");
        customer.setCustomerState("QQ");
        customer.setCustomerLocation(6);
        customer.setCustomerReference(1008);
        customerVoMapper.insertCustomerVo(customer);

    }


}
