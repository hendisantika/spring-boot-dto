package com.hendisantika.demo.controller;

import com.hendisantika.demo.dto.UserDTO;
import com.hendisantika.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
    UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<UserDTO> getUsers(Pageable page) {
        List<UserDTO> users = userService.findUsers(page);
        return users.stream()
                .map(post -> convertToDto(post))
                .collect(Collectors.toList());
    }
}
