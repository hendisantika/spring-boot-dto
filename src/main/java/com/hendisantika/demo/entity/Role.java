package com.hendisantika.demo.entity;

import javax.persistence.*;

/***
 * Created by IntelliJ IDEA
 * Project Name : demo
 * Username : Hendi Santika
 * Date Time : 12/20/2017 5:27 PM
 * email : hendisantika@gmail.com
 * Telegram : @hendisantika34
 */

@Entity
@Table(name = "T_ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role")
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
