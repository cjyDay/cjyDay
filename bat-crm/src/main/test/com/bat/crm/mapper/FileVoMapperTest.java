package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.File;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.FileVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class FileVoMapperTest {
    @Resource
    private  FileVoMapper fileVoMapper;


    @Test
    public void selectFileVo() {
        System.out.println(fileVoMapper.selectFileVo());
    }
    @Test
    public void  selectCustomerVoKeyName(){
        System.out.println(fileVoMapper.selectFileVoVoKeyName("金秋荷"));
    }

    @Test
    public void updateAdmin(){
        File file=new File();
        file.setFileId(1);
        file.setFileName("s舞蹈秘籍");
        file.setFileSize("2000kb");
        file.setFileTime("2020-02-07 23:48:17.0");
        file.setFileUName(1002);
        fileVoMapper.updateFileVo(file);
    }

    @Test
    public void selectByPrimaryKeyCustomerVo() {
        FileVo fileVo = fileVoMapper.selectByPrimaryKeyFileVo(1);
        System.out.println(fileVo);
    }
    @Test
    public void delCustomerVo() {

        System.out.println(fileVoMapper.delFileVo(6));
    }
    @Test
    public void insertEmployeeVo() {
        File file=new File();
        file.setFileName("X舞蹈秘籍");
        file.setFileSize("2000kb");
        file.setFileTime("2020-02-07 23:48:17.0");
        file.setFileUName(1002);
        fileVoMapper.insertFileVo(file);

    }


}
