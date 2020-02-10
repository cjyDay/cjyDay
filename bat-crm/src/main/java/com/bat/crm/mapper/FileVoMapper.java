package com.bat.crm.mapper;


import com.bat.crm.entity.Customer;
import com.bat.crm.entity.File;
import com.bat.crm.vo.CustomerVo;
import com.bat.crm.vo.FileVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FileVoMapper {



    //删除
    int delFileVo(int fileId);


    //添加
    int insertFileVo(File file);


    //单查询
    FileVo selectByPrimaryKeyFileVo(Integer fileId);

    //查询所有
    List<FileVo> selectFileVo();

    //根据客户姓名查询
    List<FileVo>selectFileVoVoKeyName(String employeeName);


    //修改
    int updateFileVo(File file);


}
