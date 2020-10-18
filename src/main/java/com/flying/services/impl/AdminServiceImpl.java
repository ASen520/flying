package com.flying.services.impl;

import com.flying.bean.Admin;
import com.flying.dao.AdminDao;
import com.flying.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public int deleteByid(Integer id) {
        return adminDao.deleteByid(id);
    }

    @Override
    public int insert(Admin record) {
        return adminDao.insert(record);
    }

    @Override
    public Admin selectByid(Integer id) {
        return adminDao.selectByid(id);
    }

    @Override
    public List<Admin> selectAll() {
        return adminDao.selectAll();
    }

    @Override
    public int updateByid(Admin record) {
        return adminDao.updateByid(record);
    }

    @Override
    public Admin login(String adname, String pwd) {
        return adminDao.login(adname,pwd);
    }

    @Override
    public int deleteAll(String[] listid) {
        return adminDao.deleteAll(listid);
    }


}
