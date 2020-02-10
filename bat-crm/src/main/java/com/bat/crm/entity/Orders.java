package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private Integer orderId;
   private  Integer orderCustomer;
   private  Integer  orderGoods;
    private  String orderGoodsNum;
    private  String orderPrice;
    private  String  orderBrithTime;
}
