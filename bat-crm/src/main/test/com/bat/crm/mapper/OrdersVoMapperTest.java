package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.Orders;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.OrdersVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrdersVoMapperTest {
    @Resource
    private  OrdersVoMapper ordersVoMapper;


    @Test
    public void selectCustomerOrdersVo() {
        System.out.println(ordersVoMapper.selectCustomerOrdersVo());
    }
    @Test
    public void  selectCustomerVoKeyName(){
        System.out.println(ordersVoMapper.selectCustomerContactVoKeyName("昆鹏"));
    }
    @Test
    public void  selectCustomerContactVoKeyGoodName(){
        System.out.println(ordersVoMapper.selectCustomerContactVoKeyGoodName("蝙蝠"));
    }
    @Test
    public void updateAdmin(){
        Orders orders=new Orders();
        orders.setOrderId(10010);
        orders.setOrderBrithTime("2020-02-07 23:22:25.0");
        orders.setOrderGoods(106);
        orders.setOrderCustomer(9);
        orders.setOrderGoodsNum("20");
        orders.setOrderPrice("2000");
        ordersVoMapper.updateOrdersVo(orders);
    }

    @Test
    public void selectByPrimaryKeyCustomerVo() {
        OrdersVo ordersVo = ordersVoMapper.selectByPrimaryKeyOrdersVo(10001);
        System.out.println(ordersVo);
    }
    @Test
    public void delCustomerVo() {

        System.out.println(ordersVoMapper.delOrdersVo(10010));
    }
    @Test
    public void insertEmployeeVo() {
        Orders orders=new Orders();
        orders.setOrderBrithTime("2020-02-07 23:22:25.0");
        orders.setOrderGoods(105);
        orders.setOrderCustomer(9);
        orders.setOrderGoodsNum("20");
        orders.setOrderPrice("2000");
        ordersVoMapper.insertOrdersVo(orders);
    }


}
