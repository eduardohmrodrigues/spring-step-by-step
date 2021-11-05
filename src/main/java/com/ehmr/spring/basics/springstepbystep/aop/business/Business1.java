package com.ehmr.spring.basics.springstepbystep.aop.business;

import com.ehmr.spring.basics.springstepbystep.aop.aspect.TrackTime;
import com.ehmr.spring.basics.springstepbystep.aop.data.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("business1")
public class Business1 implements MyBusiness {

    @Autowired
    @Qualifier("dao1")
    private MyDao dao;

    @Override
    @TrackTime
    public String getSomething() {
        return "Business 1: " + dao.retrieveSomething();
    }
}
