package com.hendisantika.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/***
 * Created by IntelliJ IDEA
 * Project Name : auth-server
 * Username : Hendi Santika
 * Date Time : 9/26/2017 7:08 AM
 * email : hendisantika@gmail.com
 * Telegram : @hendisantika34
 */

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "role")
    @NotNull
    private String roles;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "LAST_AUTHENTICATED")
    private Date lastAuthenticated;

    @Column(name = "INVALID_PASSWORD_ATTEMPTS")
    private int invalidPasswordAttempts;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "active")
    private int active;

    public User() {
    }

    public User(String firstName, String lastName, String email, String roles, Date createdDate, Date modifiedDate, Date lastAuthenticated, int invalidPasswordAttempts, String remarks, int active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.lastAuthenticated = lastAuthenticated;
        this.invalidPasswordAttempts = invalidPasswordAttempts;
        this.remarks = remarks;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getLastAuthenticated() {
        return lastAuthenticated;
    }

    public void setLastAuthenticated(Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
    }

    public int getInvalidPasswordAttempts() {
        return invalidPasswordAttempts;
    }

    public void setInvalidPasswordAttempts(int invalidPasswordAttempts) {
        this.invalidPasswordAttempts = invalidPasswordAttempts;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
