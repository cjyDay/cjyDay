package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class GoodsMapperTest {
    @Resource
    private  GoodsMapper goodsMapper;


    @Test
    public void selectAllList() {
        System.out.println(goodsMapper.selectAllList());
    }

    @Test
    public void selectByPrimaryKeyGoodsName() {
        System.out.println(goodsMapper.selectByPrimaryKeyGoodsName("蝙蝠"));
    }

    @Test
    public void updateByPrimaryKeyGoods(){
        Goods goods =new Goods();
        goods.setGoodsName("AA");
        goods.setGoodsNumber("AA");
        goods.setGoodsLikes("AA");
        goods.setGoodsTime("2018-8-7");
        goods.setGoodsId(111);
        goodsMapper.updateByPrimaryKeyGoods(goods);
    }
    @Test
    public void selectByPrimaryKeyGoods() {
        Goods goods = goodsMapper.selectByPrimaryKeyGoods(101);
        System.out.println(goods);
    }
    @Test
    public void delGoods() {
        System.out.println(goodsMapper.delGoods(111));
    }
    @Test
    public void insertGoods() {
        Goods goods =new Goods();
        goods.setGoodsName("SS");
        goods.setGoodsNumber("SS");
        goods.setGoodsLikes("SS");
        goods.setGoodsTime("2018-5-8");
        goodsMapper.insertGoods(goods);
    }


}
