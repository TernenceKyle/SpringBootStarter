package com.ezzra.springbootinter;

import com.ezzra.springbootinter.dao.IUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootinterApplication.class)
public class test {
    @Autowired
    private IUserMapper mapper;
    @Test
    public void testMybatis(){
        System.out.println(mapper.findAll());
        System.out.println("Master Branch Content");
    }
}
