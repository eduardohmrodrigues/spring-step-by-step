package com.ehmr.spring.basics.springstepbystep.aop.business;

import com.ehmr.spring.basics.springstepbystep.aop.data.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("business2")
public class Business2 implements MyBusiness {

    @Autowired
    @Qualifier("dao2")
    private MyDao dao;

    @Override
    public String getSomething() {
        return "Business 2: " + dao.retrieveSomething();
    }
}
