package com.hendisantika.demo.business.impl;

import com.hendisantika.demo.business.UserBusiness;
import com.hendisantika.demo.dto.UserDTO;
import com.hendisantika.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    UserRepository userRepository;

    @Override
    public Page<UserDTO> findUsers(Pageable page) {
        return userRepository.findUsers(page);
    }
}
