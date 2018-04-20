package com.puke;

import com.puke.base.Result;
import com.puke.entity.User;
import com.puke.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zijiao
 * @version 18/4/20
 */
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/findAll")
    public Result<List<User>> findAll() {
        List<User> users = userMapper.findAllUsers();
        return Result.success(users);
    }

}
