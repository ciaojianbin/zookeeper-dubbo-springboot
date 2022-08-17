package com.bing.controller;

import com.bing.pojo.User;
import com.bing.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jean.K
 * @TIME 2022/8/17 15:47
 */
@RestController
public class UserController {
    //远程调用
    @Reference
    IUserService iUserService;

    @RequestMapping("/getUserById")
    public User getUserById(int id){
        return iUserService.getUserById(id);
    }
}
