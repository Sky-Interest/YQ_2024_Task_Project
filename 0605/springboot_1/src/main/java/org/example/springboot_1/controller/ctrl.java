package org.example.springboot_1.controller;

import org.example.springboot_1.pojo.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

// 解决跨域报错
@CrossOrigin
public class ctrl {
    // 获取用户列表
    @RequestMapping(value = "/userlist")
    public List<User> userList()
    {
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"小黑","admin","guangzhou"));
        users.add(new User(2,"小白","admin","guangzhou"));
        users.add(new User(3,"小李","admin","guangzhou"));
        users.add(new User(4,"小王","admin","guangzhou"));
        users.add(new User(5,"小刘","admin","guangzhou"));
        return users;
    }

    //  测试 get 传参 操作
    @RequestMapping(value = "/geta")
    public void geta(String id)
    {
        System.out.println("id======================="+id);
    }

    // 模拟  添加功能
    @RequestMapping(value = "/addUser")
    public void  addUser(@RequestBody User user)
    {
        System.out.println("id:================"+user.getId());
        System.out.println("username:==========="+user.getUsername());
        System.out.println("password:==========="+user.getPassword());
    }
}
