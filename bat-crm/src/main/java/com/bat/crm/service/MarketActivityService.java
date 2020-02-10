package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.MarketActivity;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MarketActivityService {

    //删除
    int delMarketActivity(Integer activityId);
    //添加
    int insertMarketActivity(MarketActivity marketActivity);


    //单查询
    MarketActivity selectByPrimaryKeyMarketActivity(Integer activityId);

    //查询所有
    List<MarketActivity> selectAllList();
    //修改
    int updateByPrimaryKeyMarketActivity(MarketActivity marketActivity);

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
