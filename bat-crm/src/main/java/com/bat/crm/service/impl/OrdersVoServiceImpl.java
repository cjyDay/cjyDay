package com.bat.crm.service.impl;

import com.bat.crm.entity.Customer;
import com.bat.crm.entity.Orders;
import com.bat.crm.mapper.CustomerVoMapper;
import com.bat.crm.mapper.OrdersVoMapper;
import com.bat.crm.service.CustomerVoService;
import com.bat.crm.service.OrdersVoService;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.OrdersVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrdersVoServiceImpl implements OrdersVoService {

    @Resource
    private OrdersVoMapper ordersVoMapper;


    public int delOrdersVo(int orderId) {
        return ordersVoMapper.delOrdersVo(orderId);
    }

    public int insertOrdersVo(Orders orders) {
        return ordersVoMapper.insertOrdersVo(orders);
    }

    public OrdersVo selectByPrimaryKeyOrdersVo(int orderId) {
        return ordersVoMapper.selectByPrimaryKeyOrdersVo(orderId);
    }

    public List<OrdersVo> selectCustomerOrdersVo() {
        return ordersVoMapper.selectCustomerOrdersVo();
    }

    public List<OrdersVo> selectCustomerContactVoKeyName(String customerName) {
        return ordersVoMapper.selectCustomerContactVoKeyName(customerName);
    }

    public List<OrdersVo> selectCustomerContactVoKeyGoodName(String goodsName) {
        return ordersVoMapper.selectCustomerContactVoKeyGoodName(goodsName);
    }

    public int updateOrdersVo(Orders orders) {
        return ordersVoMapper.updateOrdersVo(orders);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<OrdersVo> list = ordersVoMapper.selectCustomerOrdersVo();
        PageInfo<OrdersVo> pageInfo = new PageInfo<OrdersVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }



}
