package com.hendisantika.demo.service;

import com.hendisantika.demo.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/17
 * Time: 07.49
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    Page<UserDTO> findUsers(Pageable page);
}
