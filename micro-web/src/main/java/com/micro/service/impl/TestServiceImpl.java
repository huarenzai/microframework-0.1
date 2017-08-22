package com.micro.service.impl;

import com.dexcoder.dal.JdbcDao;
import com.micro.entity.Test;
import com.micro.service.BaseService;
import com.micro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/12.
 */
@Service
public class TestServiceImpl extends BaseServiceImpl implements TestService {
    @Autowired
    private JdbcDao jdbcDao;
    public void test() {
        Test test=new Test();
        test.setName("2");
        test.setNodeId("aaa");
        jdbcDao.insert(test);
//        List<Map<String, Object>> maps = jdbcDao.queryListForSql("select * from test");
//        System.out.println(maps);
    }
}
