package com.bat.crm.service.impl;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.File;
import com.bat.crm.mapper.AdminMapper;
import com.bat.crm.mapper.FileVoMapper;
import com.bat.crm.service.AdminService;
import com.bat.crm.service.FileVoService;
import com.bat.crm.vo.FileVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FileVoServiceImpl implements FileVoService {

    @Resource
    private FileVoMapper fileVoMapper;

    public int delFileVo(int fileId) {
        return fileVoMapper.delFileVo(fileId);
    }

    public int insertFileVo(File file) {
        return fileVoMapper.insertFileVo(file);
    }

    public FileVo selectByPrimaryKeyFileVo(Integer fileId) {
        return fileVoMapper.selectByPrimaryKeyFileVo(fileId);
    }

    public List<FileVo> selectFileVo() {
        return fileVoMapper.selectFileVo();
    }

    public List<FileVo> selectFileVoVoKeyName(String employeeName) {
        return fileVoMapper.selectFileVoVoKeyName(employeeName);
    }

    public int updateFileVo(File file) {
        return fileVoMapper.updateFileVo(file);
    }

    public PageInfo selectLimit(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<FileVo> list = fileVoMapper.selectFileVo();
        PageInfo<FileVo> pageInfo = new PageInfo<FileVo>(list);
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("页面大小："+pageInfo.getPageSize());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("总页面数："+pageInfo.getPages());
        return pageInfo;
    }




}
