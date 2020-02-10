package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private  Integer  fileId;
    private  String fileName;
    private  Integer fileUName;
    private  String  fileTime;
    private  String fileSize;
}
