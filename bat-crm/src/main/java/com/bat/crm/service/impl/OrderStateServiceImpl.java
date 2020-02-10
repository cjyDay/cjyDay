package com.bat.crm.service.impl;

import com.bat.crm.entity.Orders;
import com.bat.crm.mapper.OrderStateMapper;
import com.bat.crm.mapper.OrdersVoMapper;
import com.bat.crm.service.OrderStateService;
import com.bat.crm.service.OrdersVoService;
import com.bat.crm.vo.OrderStateVo;
import com.bat.crm.vo.OrdersVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderStateServiceImpl implements OrderStateService {

    @Resource
    private OrderStateMapper orderStateMapper;


    public int delOrderState(Integer orderId) {
        return orderStateMapper.delOrderState(orderId);
    }

    public int insertOrderState(OrderStateVo orderStateVo) {
        return orderStateMapper.insertOrderState(orderStateVo);
    }

    public OrderStateVo selectByPrimaryKeyOrderState(Integer orderId) {
        return orderStateMapper.selectByPrimaryKeyOrderState(orderId);
    }

    public List<OrderStateVo> selectAllListOrderState() {
        return orderStateMapper.selectAllListOrderState();
    }

    public int updateByPrimaryKeyOrderState(OrderStateVo orderStateVo) {
        return orderStateMapper.updateByPrimaryKeyOrderState(orderStateVo);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<OrderStateVo> list = orderStateMapper.selectAllListOrderState();
        PageInfo<OrderStateVo> pageInfo = new PageInfo<OrderStateVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }



}
