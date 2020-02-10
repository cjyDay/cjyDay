package com.bat.crm.service;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.File;
import com.bat.crm.vo.FileVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FileVoService {


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
    /**
     * 分页查询
     * @param pageNum
     * @return
     */
    PageInfo selectLimit(int pageNum);
}
