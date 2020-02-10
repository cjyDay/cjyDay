package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Schedule;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.ScheduleMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.ScheduleService;
import com.bat.crm.vo.ScheduleVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    @Resource
    private ScheduleMapper scheduleMapper;


    public int delSchedule(Integer scheduleId) {
        return scheduleMapper.delSchedule(scheduleId);
    }

    public int insertSchedule(Schedule schedule) {
        return scheduleMapper.insertSchedule(schedule);
    }

    public ScheduleVo selectByPrimaryKeySchedule(Integer scheduleId) {
        return scheduleMapper.selectByPrimaryKeySchedule(scheduleId);
    }

    public List<ScheduleVo> selectAllList() {
        return scheduleMapper.selectAllList();
    }

    public int updateByPrimaryKeySchedule(Schedule schedule) {
        return scheduleMapper.updateByPrimaryKeySchedule(schedule);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<ScheduleVo> list = scheduleMapper.selectAllList();
        PageInfo<ScheduleVo> pageInfo = new PageInfo<ScheduleVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }



}
