package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: IceBreaker
 * @Date: 2022-05-26 21:32
 * @Description: TODO
 * @Version: 0.0.1
 */
@RestController
public class testController {
    @RequestMapping("/demo")
    public String demo(){
        return "hello springboot 鸡巴";
    }
}
