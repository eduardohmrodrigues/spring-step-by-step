package com.ehmr.spring.basics.springstepbystep.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.trackTimeAnnotation()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object retVal = proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        logger.info("Time to execute {} was {}ms", proceedingJoinPoint, executionTime);

        return retVal;
    }
}
