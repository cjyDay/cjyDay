package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Schedule;
import com.bat.crm.vo.ScheduleVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ScheduleMapperTest {
    @Resource
    private  ScheduleMapper scheduleMapper;


    @Test
    public void selectAllList() {
        System.out.println(scheduleMapper.selectAllList());
    }



    @Test
    public void updateSchedule(){
        Schedule schedule= new Schedule();
        schedule.setScheduleStartTime("2020-02-07");
        schedule.setScheduleState("aa");
        schedule.setScheduleTitle("ss");
        schedule.setScheduleUName(2);
        schedule.setScheduleType("ss");
        schedule.setScheduleFinishTime("2020-02-07");
         schedule.setScheduleId(3);
        scheduleMapper.updateByPrimaryKeySchedule(schedule);
    }
    @Test
    public void selectByPrimaryKeySchedule() {
        ScheduleVo schedule = scheduleMapper.selectByPrimaryKeySchedule(1);
        System.out.println(schedule);
    }
    @Test
    public void delSchedule() {
        System.out.println(scheduleMapper.delSchedule(3));
    }
    @Test
    public void insertSchedule() {
        Schedule schedule= new Schedule();
        schedule.setScheduleStartTime("2020-02-07");
        schedule.setScheduleState("aa");
        schedule.setScheduleTitle("ss");
        schedule.setScheduleUName(2);
        schedule.setScheduleType("ss");
        schedule.setScheduleFinishTime("2020-02-07");
        scheduleMapper.insertSchedule(schedule);
    }


}
