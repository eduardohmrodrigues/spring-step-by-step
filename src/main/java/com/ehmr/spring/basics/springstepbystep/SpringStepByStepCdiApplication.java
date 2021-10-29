package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStepByStepCdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringStepByStepScopeApplication.class, args);

        SomeCdiBusiness cdiBusiness = appContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{}", cdiBusiness);
    }
}
