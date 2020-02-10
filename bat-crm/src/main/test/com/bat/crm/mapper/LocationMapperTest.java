package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LocationMapperTest {
    @Resource
    private  LocationMapper locationMapper;


    @Test
    public void selectAllList() {
        System.out.println(locationMapper.selectAllList());
    }



    @Test
    public void selectByPrimaryKeyLocation() {
        Location location = locationMapper.selectByPrimaryKeyLocation(1);
        System.out.println(location);
    }

    @Test
    public void insertLocation() {
        Location location =new Location();
        location.setLocationName("ss");
        locationMapper.insertLocation(location);
    }


}
