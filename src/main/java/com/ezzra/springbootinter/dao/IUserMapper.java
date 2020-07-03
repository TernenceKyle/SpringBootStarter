package com.ezzra.springbootinter.dao;

import com.ezzra.springbootinter.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("UserMapper")
public interface IUserMapper {
    public List<User> findAll();
}
