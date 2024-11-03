package com.study.springcore.case01;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand("BMW");
        car.setPrice(1000.0);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
