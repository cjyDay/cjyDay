package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private  int adminId;
    private  String adminName;
    private  String adminPassword;
    private  String adminPicture;


}
