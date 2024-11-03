package com.study.springcore.case03.aop;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyLoggerAspect {

    @Pointcut(value = "execution (* com.study.springcore.case03.aop.*.*(..))")
    public void test(){
    }
    
    @Before(value = "test()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object args[] = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("method: " + methodName + ",args: " + Arrays.toString(args));
    }

    @After(value = "test()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("後置通知");
    }

    @AfterReturning(value = "test()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("method:" + methodName + ",result" + result);
    }

    @AfterThrowing(value = "test()", throwing = "e")
    public void afterTrowingMethod(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("有異常" + e);
    }

//    @Around(value = "execution (* com.study.springcore.case03.aop.*.*(..))")
//    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
//        Object result = null;
//        try {
//            System.out.println("前置通知");
//            result = joinPoint.proceed();
//            System.out.println("返回通知");
//            return result;
//        } catch (Throwable e) {
//            System.out.println("異常通知");
//            e.printStackTrace();
//        } finally {
//            System.out.println("後置通知");
//
//        }
//        return null;
//    }

}
