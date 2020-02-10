package com.bat.crm.mapper;

import com.bat.crm.entity.Admin;
import com.bat.crm.entity.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LocationMapper {



    //添加
    int insertLocation(Location location);


    //单查询
    Location selectByPrimaryKeyLocation(Integer locationId);

    //查询所有
    List<Location> selectAllList();


}
