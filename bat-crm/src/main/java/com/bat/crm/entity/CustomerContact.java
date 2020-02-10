package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerContact {
    private Integer contactId;
    private Integer contactCustomer;
    private Integer  contactEmployee;
    private Integer  contactTimes;
}
