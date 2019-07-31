package com.example.mapper;


import com.example.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    void addUser(User user);
}
