package com.ehmr.spring.basics.springstepbystep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // Defines the Pointcut
    @Before("com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        // The logic of "what to do" is called an Advice
        logger.info("Intercepted method calls - {}" , joinPoint);
    }
}
