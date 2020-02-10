package com.bat.crm.mapper;


import com.bat.crm.entity.Employee;
import com.bat.crm.entity.Notice;
import com.bat.crm.vo.EmployeeVo;
import com.bat.crm.vo.NoticeEmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NoticeVoMapper {


    //删除
    int delNoticeEmployeeVo(int noticeId);


    //添加
    int insertNoticeEmployeeVo(Notice notice);


    //单查询
    NoticeEmployeeVo selectByPrimaryKeyNoticeEmployeeVo(Integer noticeId);

    //查询所有
    List<NoticeEmployeeVo> selectNoticeEmployeeVo();



    //修改
    int updateNoticeEmployeeVo(Notice notice);


}
