package com.bat.crm.service;

import com.bat.crm.entity.Notice;
import com.bat.crm.entity.Propagate;
import com.bat.crm.vo.NoticeEmployeeVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PropagateService {



    //删除
    int delPropagate(int propagateId);


    //添加
    int insertPropagate(Propagate propagate);


    //单查询
    Propagate selectByPrimaryKeyPropagate(Integer propagateId);

    //查询所有
    List<Propagate> selectPropagate();


    //修改
    int updatePropagate(Propagate propagate);

    //模糊查询根据宣传方式
    List<Propagate>selectPropagateWay(String keyword);

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
