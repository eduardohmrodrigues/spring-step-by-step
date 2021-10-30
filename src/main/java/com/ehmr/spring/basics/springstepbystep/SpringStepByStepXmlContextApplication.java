package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStepByStepXmlContextApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringStepByStepScopeApplication.class);

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext appContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml")){

            XmlPersonDAO personDAO1 = appContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{}", personDAO1);
            LOGGER.info("{}", personDAO1.getXmlJdbcConnection());
        }
    }
}
