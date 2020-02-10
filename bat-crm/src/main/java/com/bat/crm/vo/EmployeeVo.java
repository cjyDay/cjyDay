package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVo {
    private  int employeeId;
    private  String employeeName;
    private  String employeeSex;
    private  String employeeJoinTime;
    private  String departmentName;
}
