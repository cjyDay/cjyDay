package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsMapper {


    //删除
    int delGoods(Integer goodsId);
    //添加
    int insertGoods(Goods goods);


    //单查询
    Goods selectByPrimaryKeyGoods(Integer goodsId);

    //查询所有
    List<Goods> selectAllList();
    //根据货物名称查询
    List<Goods> selectByPrimaryKeyGoodsName(String goodsName);
    //修改
    int updateByPrimaryKeyGoods(Goods goods);


}
