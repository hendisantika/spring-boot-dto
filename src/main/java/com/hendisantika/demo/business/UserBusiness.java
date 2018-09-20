package com.hendisantika.demo.business;

import com.hendisantika.demo.dto.UserDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/17
 * Time: 07.41
 * To change this template use File | Settings | File Templates.
 */
public interface UserBusiness {
    List<UserDTO> getUsersList(int page, int size, String sortDir, String sort);
}
