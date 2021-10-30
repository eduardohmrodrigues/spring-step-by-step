package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringStepByStepScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext appContext =
                    new AnnotationConfigApplicationContext(SpringStepByStepBasicApplication.class)){

            PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);
            PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDAO1);
            LOGGER.info("{}", personDAO1.getJdbcConnection());

            LOGGER.info("{}", personDAO2);
            LOGGER.info("{}", personDAO2.getJdbcConnection());
            LOGGER.info("{}", personDAO2.getJdbcConnection());
        }
    }
}
