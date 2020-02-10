package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerContactVo {
    private  Integer  contactId;
    private  String   customerName;
    private String   employeeName;
    private  Integer contactTimes;


}
