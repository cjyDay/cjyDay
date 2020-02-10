package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.MarketActivity;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.MarketActivityMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.MarketActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MarketActivityServiceImpl implements MarketActivityService {

    @Resource
    private MarketActivityMapper marketActivityMapper;

    public int delMarketActivity(Integer activityId) {
        return marketActivityMapper.delMarketActivity(activityId);
    }

    public int insertMarketActivity(MarketActivity marketActivity) {
        return marketActivityMapper.insertMarketActivity(marketActivity);
    }

    public MarketActivity selectByPrimaryKeyMarketActivity(Integer activityId) {
        return marketActivityMapper.selectByPrimaryKeyMarketActivity(activityId);
    }

    public List<MarketActivity> selectAllList() {
        return marketActivityMapper.selectAllList();
    }

    public int updateByPrimaryKeyMarketActivity(MarketActivity marketActivity) {
        return marketActivityMapper.updateByPrimaryKeyMarketActivity(marketActivity);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<MarketActivity> listmarketActivityMapper = marketActivityMapper.selectAllList();
        PageInfo<MarketActivity> pageInfo = new PageInfo<MarketActivity>(listmarketActivityMapper);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;

    }





}
