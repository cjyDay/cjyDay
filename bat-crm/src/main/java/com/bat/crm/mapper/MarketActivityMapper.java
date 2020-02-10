package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.MarketActivity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MarketActivityMapper {



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


}
