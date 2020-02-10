package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Location;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.LocationMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.LocationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {

    @Resource
    private LocationMapper locationMapper;


    public int insertLocation(Location location) {
        return locationMapper.insertLocation(location);
    }

    public Location selectByPrimaryKeyLocation(Integer locationId) {
        return locationMapper.selectByPrimaryKeyLocation(locationId);
    }

    public List<Location> selectAllList() {
        return locationMapper.selectAllList();
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Location> listLocation = locationMapper.selectAllList();
        PageInfo<Location> pageInfo = new PageInfo<Location>(listLocation);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }




}
