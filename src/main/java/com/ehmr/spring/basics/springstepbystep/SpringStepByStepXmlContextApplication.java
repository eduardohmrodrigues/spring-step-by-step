package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.scope.PersonDAO;
import com.ehmr.spring.basics.springstepbystep.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStepByStepXmlContextApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext appContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml")){

            LOGGER.info("Beans -> {}", (Object) appContext.getBeanDefinitionNames());

            PersonDAO personDAO = appContext.getBean(PersonDAO.class);
            XmlPersonDAO xmlPersonDAO = appContext.getBean(XmlPersonDAO.class);

            LOGGER.info("PersonDAO -> {} {}", personDAO, personDAO.getJdbcConnection());
            LOGGER.info("XlmPersonDAO -> {} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
        }
    }
}
