package com.study.springcore.case03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
    
    private MathI mathI;
    
    public ProxyUtil(MathI mathI) {
        this.mathI = mathI;
    }
    
    public Object getProxy() {
        ClassLoader loader = this.getClass().getClassLoader();
        Class interfaces[] = mathI.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            Object result = null;
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    MyLogger.before(method.getName(), args);
                    result = method.invoke(mathI, args);
                    System.out.println(result);
                } catch (Exception e) {
                    e.printStackTrace();
                    MyLogger.throwing();
                } finally {
                    MyLogger.after(method.getName(), result);
                }
                return result;
            }
        });
    }
    
}
