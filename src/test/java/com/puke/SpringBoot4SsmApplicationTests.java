package com.puke;

import com.puke.entity.User;
import com.puke.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public class SpringBoot4SsmApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        userMapper.insert("zijiao", "123456", "12345678910");
        User u = userMapper.findUserByPhone("12345678910");
        Assert.assertEquals("winterchen", u.getName());
    }

}
