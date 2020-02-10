package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.vo.OrderStateVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderStateMapper {



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


}
