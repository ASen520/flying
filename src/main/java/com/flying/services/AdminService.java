package com.flying.services;

import com.flying.bean.Admin;

import java.util.List;

public interface AdminService {
    int deleteByid(Integer id);

    int insert(Admin record);

    Admin selectByid(Integer id);

    List<Admin> selectAll();

    int updateByid(Admin record);

    Admin login(String name,String pwd);

    int deleteAll(String[] listid);
}
