package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Goods;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.GoodsMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    public int delGoods(Integer goodsId) {
        return goodsMapper.delGoods(goodsId);
    }

    public int insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }

    public Goods selectByPrimaryKeyGoods(Integer goodsId) {
        return goodsMapper.selectByPrimaryKeyGoods(goodsId);
    }

    public List<Goods> selectAllList() {
        return goodsMapper.selectAllList();
    }

    public List<Goods> selectByPrimaryKeyGoodsName(String goodsName) {
        return goodsMapper.selectByPrimaryKeyGoodsName(goodsName);
    }

    public int updateByPrimaryKeyGoods(Goods goods) {
        return goodsMapper.updateByPrimaryKeyGoods(goods);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Goods> list = goodsMapper.selectAllList();
        PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }


}
