package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Schedule;
import com.bat.crm.vo.ScheduleVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ScheduleService {

    //删除
    int delSchedule(Integer scheduleId);
    //添加
    int insertSchedule(Schedule schedule);


    //单查询
    ScheduleVo selectByPrimaryKeySchedule(Integer scheduleId);

    //查询所有
    List<ScheduleVo> selectAllList();
    //修改
    int updateByPrimaryKeySchedule(Schedule schedule);
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
