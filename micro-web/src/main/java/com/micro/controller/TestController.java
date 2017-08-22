package com.micro.controller;

import api.TaskAllocationSdkService;
import com.dexcoder.dal.JdbcDao;
import com.micro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/24.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private TaskAllocationSdkService taskAllocationSdkService;

    @RequestMapping("/test")
    public void test(){
        taskAllocationSdkService.initTask("123456");
//        testService.test();
    }
}
