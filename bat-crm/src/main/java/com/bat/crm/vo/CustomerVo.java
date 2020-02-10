package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVo {

    private  Integer customerId;

    private  String  customerName;

    private  String   customerAge;

    private  String customerSex;

    private  String customerState;

    private  String employeeName;

    private  String locationName;
}
