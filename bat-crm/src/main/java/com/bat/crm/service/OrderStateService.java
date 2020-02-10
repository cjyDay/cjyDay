package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.vo.OrderStateVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderStateService {

    //删除
    int delOrderState(Integer orderId);
    //添加
    int insertOrderState(OrderStateVo orderStateVo);


    //单查询
    OrderStateVo selectByPrimaryKeyOrderState(Integer orderId);

    //查询所有
    List<OrderStateVo> selectAllListOrderState();
    //修改
    int updateByPrimaryKeyOrderState(OrderStateVo orderStateVo);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
