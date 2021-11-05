package com.ehmr.spring.basics.springstepbystep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.businessLayerExecution()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.businessLayerExecution()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("{} thrown an exception {}", joinPoint, exception);
    }

    @After("com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        logger.info("Intercepted AFTER method calls {}", joinPoint);
    }
}
