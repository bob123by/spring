package com.study.springcore.case03.aop;

import org.springframework.stereotype.Component;


@Component
public class MathImpl implements MathI {

    @Override
    public Integer add(Integer x, Integer y) {
        int result = x+y;
        return result;
    }

    @Override
    public Integer sub(Integer x, Integer y) {
        int result = x-y;
        return result;
    }

    @Override
    public Integer mul(Integer x, Integer y) {
        int result = x*y;
        return result;
    }

    @Override
    public Integer div(Integer x, Integer y) {
        int result = x/y;
        return result;
    }

}
