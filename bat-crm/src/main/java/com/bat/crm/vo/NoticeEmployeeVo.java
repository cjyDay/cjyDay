package com.bat.crm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeEmployeeVo {
    private   Integer noticeId;

    private  String noticeTitle;

    private  String  noticeType;

    private  String noticeTime;

    private  String employeeName;

}
