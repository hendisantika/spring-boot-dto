package com.hendisantika.demo.controller;

import com.hendisantika.demo.entity.User;
import com.hendisantika.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * Created by IntelliJ IDEA
 * Project Name : demo
 * Username : Hendi Santika
 * Date Time : 12/20/2017 4:58 PM
 * email : hendisantika@gmail.com
 * Telegram : @hendisantika34
 */

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    Page<User> getAllUsers(Pageable page) {
        return userRepository.findAll(page);
    }
}
