package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Schedule;
import com.bat.crm.vo.ScheduleVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ScheduleMapper {


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


}
