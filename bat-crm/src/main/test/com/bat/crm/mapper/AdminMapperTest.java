package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AdminMapperTest {
    @Resource
    private  AdminMapper adminMapper;


    @Test
    public void selectAllList() {
        System.out.println(adminMapper.selectAllList());
    }

    @Test
    public void login() {
        Admin admin = new Admin();
        admin.setAdminName("admin");
        admin.setAdminPassword("123");

        System.out.println(adminMapper.login(admin));
    }

    @Test
    public void updateAdmin(){
        Admin admins= new Admin();
        admins.setAdminName("admin");
        admins.setAdminPassword("admin");
        admins.setAdminPicture("12.jpg");
        admins.setAdminId(6);
        adminMapper.updateByPrimaryKey(admins);
    }
    @Test
    public void findAdminById() {
        Admin admins = adminMapper.selectByPrimaryKey(1);
        System.out.println(admins);
    }
    @Test
    public void delAdmin() {
        Admin admins= new Admin();

        admins.setAdminId(7);
        adminMapper.delAdmin(admins);
    }
    @Test
    public void addAdmin() {
        Admin admins= new Admin();
        admins.setAdminName("cc");
        admins.setAdminPassword("1215");
        admins.setAdminPicture("12.jpg");
        adminMapper.insert(admins);
    }


}
