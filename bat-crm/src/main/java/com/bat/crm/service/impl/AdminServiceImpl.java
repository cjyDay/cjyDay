package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.service.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl  implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    public Admin login(Admin admin) {
        Admin admi=adminMapper.login(admin);
        return admi;
    }
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    public int delAdmin(Admin admin) {
        return adminMapper.delAdmin(admin);
    }

    public int updateByPrimaryKey(Admin admin) {
        return adminMapper.updateByPrimaryKey(admin);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Admin> list = adminMapper.selectAllList();
        PageInfo<Admin> pageInfo = new PageInfo<Admin>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }

    public Admin selectByPrimaryKey(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }

    public List<Admin> selectAllList() {
        return adminMapper.selectAllList();
    }



}
