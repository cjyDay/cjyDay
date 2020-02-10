package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GoodsService {


    //删除
    int delGoods(Integer goodsId);
    //添加(注册)
    int insertGoods(Goods goods);


    //单查询
    Goods selectByPrimaryKeyGoods(Integer goodsId);

    //查询所有
    List<Goods> selectAllList();
    //根据货物名称查询
    List<Goods> selectByPrimaryKeyGoodsName(String goodsName);
    //修改
    int updateByPrimaryKeyGoods(Goods goods);

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
