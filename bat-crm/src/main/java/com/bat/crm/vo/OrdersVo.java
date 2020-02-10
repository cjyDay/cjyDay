package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersVo {
    private Integer orderId;
    private  String customerName;
    private  String  goodsName;
    private  String orderGoodsNum;
    private  String orderPrice;
    private  String  orderBrithTime;
}
