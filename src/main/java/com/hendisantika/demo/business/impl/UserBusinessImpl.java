package com.hendisantika.demo.business.impl;

import com.hendisantika.demo.business.UserBusiness;
import com.hendisantika.demo.dto.UserDTO;
import com.hendisantika.demo.entity.User;
import com.hendisantika.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/17
 * Time: 07.46
 * To change this template use File | Settings | File Templates.
 */

@Component
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getUsersList(int page, int size, String sortDir, String sort) {

        PageRequest pageReq = new PageRequest(page, size, Sort.Direction.fromString(sortDir), sort);

        Page<User> users = userRepository.getUsersList(0, 20, "firstName", "asc");
        return users.getContent();
    }
}

