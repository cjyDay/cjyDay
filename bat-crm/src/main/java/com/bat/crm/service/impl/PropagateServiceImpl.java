package com.bat.crm.service.impl;


import com.bat.crm.entity.Notice;
import com.bat.crm.entity.Propagate;
import com.bat.crm.mapper.NoticeVoMapper;
import com.bat.crm.mapper.PropagateMapper;
import com.bat.crm.service.NoticeVoService;
import com.bat.crm.service.PropagateService;
import com.bat.crm.vo.NoticeEmployeeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PropagateServiceImpl implements PropagateService {

    @Resource
    private PropagateMapper propagateMapper;


    public int delPropagate(int propagateId) {
        return propagateMapper.delPropagate(propagateId);
    }

    public int insertPropagate(Propagate propagate) {
        return propagateMapper.insertPropagate(propagate);
    }

    public Propagate selectByPrimaryKeyPropagate(Integer propagateId) {
        return propagateMapper.selectByPrimaryKeyPropagate(propagateId);
    }

    public List<Propagate> selectPropagate() {
        return propagateMapper.selectPropagate();
    }

    public int updatePropagate(Propagate propagate) {
        return propagateMapper.updatePropagate(propagate);
    }

    public List<Propagate> selectPropagateWay(String keyword) {
        return propagateMapper.selectPropagateWay(keyword);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Propagate> listPropagate = propagateMapper.selectPropagate();
        PageInfo<Propagate> pageInfo = new PageInfo<Propagate>(listPropagate);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }
}
