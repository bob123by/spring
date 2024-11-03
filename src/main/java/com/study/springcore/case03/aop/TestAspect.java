
package com.study.springcore.case03.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class TestAspect {

    @Before(value = "execution(* com.study.springcore.case03.aop.*.*(..))")
    public void before(){
        System.out.println("TestAspect==>前置通知");
    }
    
}
