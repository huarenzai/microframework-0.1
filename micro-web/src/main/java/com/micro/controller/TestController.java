package com.micro.controller;

import com.dexcoder.dal.JdbcDao;
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
    private JdbcDao jdbcDao;

    @RequestMapping("/test")
    public void test(){
        List<Map<String, Object>> maps = jdbcDao.queryListForSql("select * from test");
        System.out.println(maps);
    }
}
