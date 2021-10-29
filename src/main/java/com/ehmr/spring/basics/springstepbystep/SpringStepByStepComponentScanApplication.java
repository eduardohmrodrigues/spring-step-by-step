package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ehmr.spring.basics.componentscan")
public class SpringStepByStepComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringStepByStepScopeApplication.class, args);

        ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
    }
}
