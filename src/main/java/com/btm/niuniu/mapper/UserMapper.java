package com.btm.niuniu.mapper;

import com.btm.niuniu.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select(value = {"SELECT * FROM user WHERE user_name = #{userName}"})
    List<User> getUserByUserName(String userName);

    @Select(value = { "SELECT * FROM user" })
    List<User> listAllUser();

    @Select(value = "INSERT INTO USER (id,user_name,PASSWORD,create_date,create_by) VALUES (REPLACE(UUID(), '-', ''),'test0','1234',NOW(),'test')")
    int addUser(User user);
}
