package com.flying.controller;

import com.flying.bean.Admin;
import com.flying.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    //后台登录
    @RequestMapping("/login")
    public String login(String username, String pwd){
        Admin ad = adminService.login(username,pwd);
        if (ad == null){
            return "no";
        }
        if(!ad.getPwd().equalsIgnoreCase(pwd)){
            return "no";
        }
        System.out.println(ad);
        return "forward:/index.jsp";
    }
    //验证码的判断
    @RequestMapping("/code")
    @ResponseBody
    public String code(String code, HttpSession session){
        return code.equalsIgnoreCase(session.getAttribute("captcha").toString()) ? "true" : "false";
    }

    //查询所有管理员
    @GetMapping("/admins")
    public List<Admin> getAll(){
        return  adminService.selectAll();
    }
    //根据id进行单个删除管理员
    @DeleteMapping("/admins/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id){
        return adminService.deleteByid(id) == 0 ? "false" : "true";
    }
    //查询单个管理员
    @GetMapping("/admins/{id}")
    @ResponseBody
    public Admin queryUser(@PathVariable Integer id){
        return adminService.selectByid(id);
    }
    //增加一个管理员
    @PostMapping("/admins")
    @ResponseBody
    public String saveUser(@RequestBody Admin admin){
        admin.setRegistertime(new Date());
        return adminService.insert(admin) == 0 ? "false" : "true";
    }
    //根据id批量删除管理员
    @RequestMapping("/deleteAll")
    @ResponseBody
    public String deleteAll(String id){
        if(id.trim().length() == 0){
            return "false";
        }
        String ids[] = id.split(",");
        return adminService.deleteAll(ids) == 0 ? "false" : "true";
    }
}
