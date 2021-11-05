package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.aop.business.MyBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStepByStepAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("business1")
    private MyBusiness business1;

    @Autowired
    @Qualifier("business2")
    private MyBusiness business2;

    public static void main(String[] args) {
        SpringApplication.run(SpringStepByStepAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("B1 GetSomething: {} ", business1.getSomething());
        logger.info("B2 GetSomething: {} ", business2.getSomething());
    }
}
