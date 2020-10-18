package com.flying.dao;

import com.flying.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminDao {
    int deleteByid(Integer id);

    int insert(Admin record);

    Admin selectByid(Integer id);

    List<Admin> selectAll();

    int updateByid(Admin record);

    Admin login(@Param("adname") String adname, @Param("pwd") String pwd);

    int deleteAll(@Param("listid")String[] listid);
}
