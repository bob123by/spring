
package com.study.springcore.case03.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestHandler {

    public void test(){
        System.out.println("測試切入點表達式");
    }
    
}
