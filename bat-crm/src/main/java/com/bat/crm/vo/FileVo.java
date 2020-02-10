package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileVo {
    private  Integer  fileId;
    private  String   fileName;
    private String   employeeName;
    private  String fileTime;
    private  String  fileSize;


}
