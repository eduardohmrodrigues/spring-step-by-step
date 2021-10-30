package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringStepByStepCdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext appContext =
                    new AnnotationConfigApplicationContext(SpringStepByStepBasicApplication.class)){
            SomeCdiBusiness cdiBusiness = appContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{}", cdiBusiness);
        }
    }
}
