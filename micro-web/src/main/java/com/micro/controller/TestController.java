package com.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/24.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("hello");
    }
}
