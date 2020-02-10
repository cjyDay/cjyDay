package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.CustomerContact;
import com.bat.crm.vo.CustomerContactVo;
import com.bat.crm.vo.CustomerVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerContactVoMapperTest {
    @Resource
    private  CustomerContactVoMapper customerContactVoMapper;


    @Test
    public void selectCustomerContactVo() {
        System.out.println(customerContactVoMapper.selectCustomerContactVo());
    }
    @Test
    public void  selectCustomerVoKeyName(){
        System.out.println(customerContactVoMapper.selectCustomerContactVoKeyName("翠彤"));
    }
    @Test
    public void  selectCustomerContactVoKeyEmployeeName(){
        System.out.println(customerContactVoMapper.selectCustomerContactVoKeyEmployeeName("卢永昌"));
    }
    @Test
    public void updateCustomerContactVo(){
        CustomerContact customerContact=new CustomerContact();
        customerContact.setContactId(6);
        customerContact.setContactCustomer(1);
        customerContact.setContactEmployee(1003);
        customerContact.setContactTimes(60);
        customerContactVoMapper.updateCustomerContactVo(customerContact);
    }

    @Test
    public void selectByPrimaryKeyCustomerContactVo() {
        CustomerContactVo customerContactVo= customerContactVoMapper.selectByPrimaryKeyCustomerContactVo(1);
        System.out.println(customerContactVo);
    }
    @Test
    public void delCustomerContactVo() {

        System.out.println(customerContactVoMapper.delCustomerContactVo(6));
    }
    @Test
    public void insertCustomerContactVo() {
        CustomerContact customerContact=new CustomerContact();

        customerContact.setContactCustomer(1);
        customerContact.setContactEmployee(1002);
        customerContact.setContactTimes(50);
        customerContactVoMapper.insertCustomerContactVo(customerContact);

    }


}
