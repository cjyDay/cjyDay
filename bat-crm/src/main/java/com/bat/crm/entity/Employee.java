package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   private  int employeeId;
    private  String employeeName;
    private  String employeeSex;
    private  String employeeJoinTime;
   private  int employeeDepartment;

}
