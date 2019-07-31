package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/add")
    public String addUser(@RequestParam("name") String name,@RequestParam("age") Integer age){
        System.out.println("我去");
        User user=new User();
        user.setName(name);
        user.setAge(age);
        userMapper.addUser(user);
        return "success";
}
}
