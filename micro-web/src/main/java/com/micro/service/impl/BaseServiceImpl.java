package com.micro.service.impl;

import com.dexcoder.dal.JdbcDao;
import com.micro.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/12.
 */
public class BaseServiceImpl implements BaseService {
    @Autowired
    protected JdbcDao jdbcDao;
    public void test(){

    }
}
