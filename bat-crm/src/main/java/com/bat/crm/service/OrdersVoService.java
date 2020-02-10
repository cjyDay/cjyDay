package com.bat.crm.service;

import com.bat.crm.entity.Customer;
import com.bat.crm.entity.Orders;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.OrdersVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrdersVoService {


    //删除
    int delOrdersVo(int orderId);


    //添加
    int insertOrdersVo(Orders orders);


    //单查询
    OrdersVo selectByPrimaryKeyOrdersVo(int orderId);

    //查询所有
    List<OrdersVo> selectCustomerOrdersVo();

    //根据客户名称查询
    List<OrdersVo>selectCustomerContactVoKeyName(String customerName);
    //根据货物名称查询
    List<OrdersVo>selectCustomerContactVoKeyGoodName(String goodsName);

    //修改
    int updateOrdersVo(Orders orders);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);

}
