package com.bat.crm.service;

import com.bat.crm.entity.Employee;
import com.bat.crm.entity.Notice;
import com.bat.crm.vo.EmployeeVo;
import com.bat.crm.vo.NoticeEmployeeVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface NoticeVoService {


    //删除
    int delNoticeEmployeeVo(int noticeId);


    //添加
    int insertNoticeEmployeeVo(Notice notice);


    //单查询
    NoticeEmployeeVo selectByPrimaryKeyNoticeEmployeeVo(Integer noticeId);

    //查询所有
    List<NoticeEmployeeVo> selectNoticeEmployeeVo();



    //修改
    int updateNoticeEmployeeVo(Notice notice);

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
