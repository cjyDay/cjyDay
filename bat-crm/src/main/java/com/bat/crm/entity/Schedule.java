package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    private  Integer scheduleId;
    private  String  scheduleTitle;
    private  String scheduleType;
    private  String scheduleStartTime;
    private  String  scheduleFinishTime;
    private  String  scheduleState;
    private  int  scheduleUName;
}
