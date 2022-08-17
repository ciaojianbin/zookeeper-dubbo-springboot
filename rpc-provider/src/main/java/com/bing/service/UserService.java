package com.bing.service;

import com.bing.pojo.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


/**
 * @author Jean.K
 * @TIME 2022/8/17 15:40
 */

@Component//这个是spring的
@Service(interfaceClass = IUserService.class)
public class UserService implements IUserService{
    @Override
    public User getUserById(int id) {
        User user = new User(id,"小华");
        return user;
    }
}
