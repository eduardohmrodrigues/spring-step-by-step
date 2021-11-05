package com.ehmr.spring.basics.springstepbystep.aop.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dao2")
public class Dao2 implements MyDao {

    @Override
    public String retrieveSomething() {
        return "Dao2";
    }
}
