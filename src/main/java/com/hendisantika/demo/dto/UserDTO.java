package com.hendisantika.demo.dto;

import java.io.Serializable;
import java.util.Date;

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
public class UserDTO implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String roles;

    private Date createdDate;

    private Date modifiedDate;

    private Date lastAuthenticated;

    private int invalidPasswordAttempts;

    private String remarks;

    private int active;

    public UserDTO() {
    }
}
