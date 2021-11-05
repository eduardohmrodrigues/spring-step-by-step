package com.ehmr.spring.basics.springstepbystep.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.ehmr.spring.basics.springstepbystep.aop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.ehmr.spring.basics.springstepbystep.aop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.dataLayerExecution() || com.ehmr.spring.basics.springstepbystep.aop.aspect.CommonPointcutConfig.businessLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {}

    @Pointcut("within(com.ehmr.spring.basics.springstepbystep.aop.data..*)")
    public void anyExecutionWithinDataLayer() {}

    @Pointcut("@annotation(com.ehmr.spring.basics.springstepbystep.aop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
