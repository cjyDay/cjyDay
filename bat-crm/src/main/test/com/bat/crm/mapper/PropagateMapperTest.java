package com.bat.crm.mapper;


import com.bat.crm.entity.Notice;
import com.bat.crm.entity.Propagate;
import com.bat.crm.vo.NoticeEmployeeVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PropagateMapperTest {
    @Resource
    private  PropagateMapper propagateMapper;


    @Test
    public void selectPropagate() {
        System.out.println(propagateMapper.selectPropagate());
    }



    @Test
    public void updatePropagate(){
        Propagate propagate= new Propagate();
        propagate.setPropagateWay("得到ss");
        propagate.setPropagateStartTime("2018-5-8");
        propagate.setPropagateEndTime("2018-5-10");
        propagate.setPropagateEffect("好");
          propagate.setPropagateId(4);
        propagateMapper.updatePropagate(propagate);
    }

    @Test
    public void selectByPrimaryKeyPropagate() {
        Propagate propagate = propagateMapper.selectByPrimaryKeyPropagate(1);
        System.out.println(propagate);
    }

    @Test
    public void selectPropagateWay() {

        System.out.println(propagateMapper.selectPropagateWay("派传单"));
    }
    @Test
    public void delPropagate() {

        propagateMapper.delPropagate(4);
    }
    @Test
    public void insertPropagate() {
        Propagate propagate= new Propagate();
        propagate.setPropagateWay("得到");
        propagate.setPropagateStartTime("2018-5-8");
        propagate.setPropagateEndTime("2018-5-10");
        propagate.setPropagateEffect("好");

        propagateMapper.insertPropagate(propagate);
    }


}
