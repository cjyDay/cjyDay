package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.MarketActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MarketActivityMapperTest {
    @Resource
    private  MarketActivityMapper MarketActivityMapper;


    @Test
    public void selectAllList() {
        System.out.println(MarketActivityMapper.selectAllList());
    }


    @Test
    public void updateAdmin(){
        MarketActivity marketActivity= new MarketActivity();
        marketActivity.setActivityName("免费SS吃SS");
        marketActivity.setActivityEmployees("李昊宇，李昊伟");
        marketActivity.setActivityStartTime("2020-02-07");
        marketActivity.setActivityEndTime("2020-02-08");
        marketActivity.setActivityId(4);
        MarketActivityMapper.updateByPrimaryKeyMarketActivity(marketActivity);

    }
    @Test
    public void selectByPrimaryKeyMarketActivity() {
        MarketActivity marketActivity = MarketActivityMapper.selectByPrimaryKeyMarketActivity(1);
        System.out.println(marketActivity);
    }
    @Test
    public void delMarketActivity() {

        System.out.println( MarketActivityMapper.delMarketActivity(4));
    }
    @Test
    public void insertMarketActivity() {
        MarketActivity marketActivity= new MarketActivity();
        marketActivity.setActivityName("免费试吃SS");
        marketActivity.setActivityEmployees("李昊宇，李昊伟");
        marketActivity.setActivityStartTime("2020-02-07");
        marketActivity.setActivityEndTime("2020-02-08");
        MarketActivityMapper.insertMarketActivity(marketActivity);

    }


}
