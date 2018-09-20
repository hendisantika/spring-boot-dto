package com.hendisantika.demo.repository;

import com.hendisantika.demo.dto.UserDTO;
import com.hendisantika.demo.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/***
 * Created by IntelliJ IDEA
 * Project Name : demo
 * Username : Hendi Santika
 * Date Time : 12/20/2017 4:56 PM
 * email : hendisantika@gmail.com
 * Telegram : @hendisantika34
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    List<UserDTO> findByUsers(Pageable page);

    List<UserDTO> getUsersList(int page, int size, String sortDir, String sort);

}
