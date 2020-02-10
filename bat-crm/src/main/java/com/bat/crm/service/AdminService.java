package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdminService {

    //登录
    Admin login(Admin admin);

    //删除
    int delAdmin(Admin admin);
    //添加(注册)
    int insert(Admin admin);


    //单查询
    Admin selectByPrimaryKey(Integer adminId);

    //查询所有
    List<Admin> selectAllList();
    //修改
    int updateByPrimaryKey(Admin admin);

    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
