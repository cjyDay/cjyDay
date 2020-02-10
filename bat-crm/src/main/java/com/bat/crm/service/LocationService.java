package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Location;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface LocationService {


    //添加
    int insertLocation(Location location);


    //单查询
    Location selectByPrimaryKeyLocation(Integer locationId);

    //查询所有
    List<Location> selectAllList();

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
