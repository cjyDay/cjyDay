package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminMapper {

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


}
