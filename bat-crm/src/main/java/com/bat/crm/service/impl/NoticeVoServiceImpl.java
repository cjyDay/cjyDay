package com.bat.crm.service.impl;


import com.bat.crm.entity.Employee;
import com.bat.crm.entity.Notice;
import com.bat.crm.mapper.EmployeeVoMapper;
import com.bat.crm.mapper.NoticeVoMapper;
import com.bat.crm.service.EmployeeVoService;
import com.bat.crm.service.NoticeVoService;
import com.bat.crm.vo.EmployeeVo;
import com.bat.crm.vo.NoticeEmployeeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NoticeVoServiceImpl implements NoticeVoService {

    @Resource
    private NoticeVoMapper noticeVoMapper;


    public int delNoticeEmployeeVo(int noticeId) {
        return noticeVoMapper.delNoticeEmployeeVo(noticeId);
    }

    public int insertNoticeEmployeeVo(Notice notice) {
        return noticeVoMapper.insertNoticeEmployeeVo(notice);
    }

    public NoticeEmployeeVo selectByPrimaryKeyNoticeEmployeeVo(Integer noticeId) {
        return noticeVoMapper.selectByPrimaryKeyNoticeEmployeeVo(noticeId);
    }


    public List<NoticeEmployeeVo> selectNoticeEmployeeVo() {
        return noticeVoMapper.selectNoticeEmployeeVo();
    }

    public int updateNoticeEmployeeVo(Notice notice) {
        return noticeVoMapper.updateNoticeEmployeeVo(notice);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<NoticeEmployeeVo> listEmployeeVo = noticeVoMapper.selectNoticeEmployeeVo();
        PageInfo<NoticeEmployeeVo> pageInfo = new PageInfo<NoticeEmployeeVo>(listEmployeeVo);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }
}
