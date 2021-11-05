package com.ehmr.spring.basics.springstepbystep.aop.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dao1")
public class Dao1 implements MyDao {

    @Override
    public String retrieveSomething() {
        return "Dao1";
    }
}
