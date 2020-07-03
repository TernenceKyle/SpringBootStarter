package com.ezzra.springbootinter.controller;

import com.ezzra.springbootinter.dao.IUserMapper;
import com.ezzra.springbootinter.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Start {
    @Autowired
    private IUserMapper userMapper;

    @RequestMapping("/controller")
    @ResponseBody
    public String testMybatis(){
        List<User> all = userMapper.findAll();
        return  all.toString();
    }
}
