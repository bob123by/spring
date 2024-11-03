package com.study.springcore.case03.proxy;

import java.util.Arrays;

public class MyLogger {

    public static void before(String methodName, Object... args) {
        System.out.println("method: " + methodName + ",args: " + Arrays.toString(args));
    }

    public static void after(String methodName, Object result) {
        System.out.println("method: " + methodName + ",result: " + result);
    }
    public static void throwing() {
        System.out.println("有異常");
    }

}
