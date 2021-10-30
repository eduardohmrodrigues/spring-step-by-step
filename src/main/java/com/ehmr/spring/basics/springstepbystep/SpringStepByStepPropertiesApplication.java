package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class SpringStepByStepPropertiesApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepPropertiesApplication.class);

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(SpringStepByStepPropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            LOGGER.info("External Service: {} {}", service, service.getServiceEndpoint());
        }
    }
}
