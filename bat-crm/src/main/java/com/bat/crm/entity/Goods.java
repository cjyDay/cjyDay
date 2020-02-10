package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsId;
    private  String  goodsName;
    private  String goodsNumber;
    private  String goodsLikes;
    private  String  goodsTime;
}
