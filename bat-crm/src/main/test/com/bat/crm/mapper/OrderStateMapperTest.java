package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.vo.OrderStateVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrderStateMapperTest {
    @Resource
    private  OrderStateMapper orderStateMapper;


    @Test
    public void selectAllList() {
        System.out.println(orderStateMapper.selectAllListOrderState());
    }



    @Test
    public void updateAdmin(){
        OrderStateVo orderStateVo=new OrderStateVo();
        orderStateVo.setOrderId(10006);
        orderStateVo.setOrderState("未付款");
        orderStateMapper.updateByPrimaryKeyOrderState(orderStateVo);
    }
    @Test
    public void selectByPrimaryKeyOrderState() {
        OrderStateVo orderStateVo = orderStateMapper.selectByPrimaryKeyOrderState(10007);
        System.out.println(orderStateVo);
    }
    @Test
    public void delOrderState() {
        System.out.println(orderStateMapper.delOrderState(10011));
    }
    @Test
    public void insertOrderState() {
        OrderStateVo orderStateVo=new OrderStateVo();
        orderStateVo.setOrderId(10011);
        orderStateVo.setOrderState("未付款");
        orderStateMapper.insertOrderState(orderStateVo);
    }


}
