
package com.study.springcore.case03.proxy;


public class Test {

    
    public static void main(String[] args) {
        MathI math = (MathI) new ProxyUtil(new MathImpl()).getProxy();
        //int result = math.add(1, 2);
        //int result = math.sub(3,1);
        int result = math.div(4,0);
        System.out.println(result);
    }

}
