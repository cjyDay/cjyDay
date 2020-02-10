package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propagate {
    private  Integer propagateId;
    private  String propagateWay;
    private  String propagateStartTime;
    private  String propagateEndTime;
    private  String propagateEffect;
}
