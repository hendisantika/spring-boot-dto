package com.hendisantika.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/***
 * Creted by IntelliJ IDEA>
 * Project Name : demo
 * Username : Hendi Santika
 * Date Time : 9/11/2017
 * email : hendisantika@gmail.com
 * Telagram : @hendisantika34
 */

@RestController

public class TestController {
    @RequestMapping("/")
    public String tes() {
        return "Hallo " + new Date();
    }
}
