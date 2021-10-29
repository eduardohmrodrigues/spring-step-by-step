package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.BinarySearchImpl;
import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.SearchAlgorithm;
import com.ehmr.spring.basics.springstepbystep.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringStepByStepScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringStepByStepScopeApplication.class, args);

        PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO1);
        LOGGER.info("{}", personDAO1.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
        LOGGER.info("{}", personDAO2.getJdbcConnection());
    }
}
