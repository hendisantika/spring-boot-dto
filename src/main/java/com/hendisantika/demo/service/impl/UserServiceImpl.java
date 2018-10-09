package com.hendisantika.demo.service.impl;

import com.hendisantika.demo.business.UserBusiness;
import com.hendisantika.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/17
 * Time: 07.50
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserBusiness userBusiness;

}
