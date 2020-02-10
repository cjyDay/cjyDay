package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private  Integer customerId;

    private  String  customerName;

    private  String   customerAge;

    private  String customerSex;

    private  String customerState;

    private  Integer customerReference;

    private  Integer customerLocation;

}
