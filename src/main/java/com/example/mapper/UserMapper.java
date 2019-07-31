package com.example.mapper;


import com.example.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    void addUser(User user);
}
