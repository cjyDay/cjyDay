package com.bat.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    private   Integer noticeId;

    private  String noticeTitle;

    private  String  noticeType;

    private  String noticeTime;

    private  Integer noticeUname;
}
