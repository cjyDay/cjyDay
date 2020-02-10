package com.bat.crm.mapper;


import com.bat.crm.entity.Notice;
import com.bat.crm.entity.Propagate;
import com.bat.crm.vo.NoticeEmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PropagateMapper {


    //删除
    int delPropagate(int propagateId);


    //添加
    int insertPropagate(Propagate propagate);


    //单查询
    Propagate selectByPrimaryKeyPropagate(Integer propagateId);

    //查询所有
    List<Propagate> selectPropagate();


    //修改
    int updatePropagate(Propagate propagate);

    //模糊查询根据宣传方式
    List<Propagate>selectPropagateWay(String keyword);

}
