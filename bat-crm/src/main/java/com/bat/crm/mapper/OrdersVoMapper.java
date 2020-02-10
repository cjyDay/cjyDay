package com.bat.crm.mapper;



import com.bat.crm.entity.Orders;
import com.bat.crm.vo.OrdersVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersVoMapper {

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


}
