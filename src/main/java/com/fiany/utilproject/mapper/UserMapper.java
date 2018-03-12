package com.fiany.utilproject.mapper;

import com.fiany.utilproject.bean.UserBean;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT username,password FROM user")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "password", column = "password")
    })
    List<UserBean> getAll();
}
