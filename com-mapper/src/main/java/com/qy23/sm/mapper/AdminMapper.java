package com.qy23.sm.mapper;

import com.qy23.sm.entity.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper {

    @Select("select * from admin")
     List<Admin> findAll();
}
