package com.bat.crm.mapper;


import com.bat.crm.entity.Employee;
import com.bat.crm.entity.Notice;
import com.bat.crm.vo.EmployeeVo;
import com.bat.crm.vo.NoticeEmployeeVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NoticeVoMapperTest {
    @Resource
    private  NoticeVoMapper noticeVoMapper;


    @Test
    public void selectNoticeEmployeeVo() {
        System.out.println(noticeVoMapper.selectNoticeEmployeeVo());
    }

    @Test
    public void updateAdmin(){
        Notice notice= new Notice();
        notice.setNoticeTitle("SS");
        notice.setNoticeType("SSSh");
        notice.setNoticeTime("2018-2-6");
        notice.setNoticeUname(1005);
        notice.setNoticeId(4);
        noticeVoMapper.updateNoticeEmployeeVo(notice);
    }

    @Test
    public void selectByPrimaryKeyNoticeEmployeeVo() {
        NoticeEmployeeVo noticeEmployeeVo = noticeVoMapper.selectByPrimaryKeyNoticeEmployeeVo(1);
        System.out.println(noticeEmployeeVo);
    }
    @Test
    public void delEmployeeVo() {

        noticeVoMapper.delNoticeEmployeeVo(4);
    }
    @Test
    public void insertEmployeeVo() {
        Notice notice= new Notice();
       notice.setNoticeTitle("SS");
       notice.setNoticeType("SSS");
       notice.setNoticeTime("2018-2-6");
       notice.setNoticeUname(1006);

        noticeVoMapper.insertNoticeEmployeeVo(notice);
    }


}
