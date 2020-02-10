package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarketActivity {

    private  int activityId;

   private  String activityName;

   private   String  activityEmployees;

   private  String activityStartTime;

   private String activityEndTime;


}
