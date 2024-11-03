package com.study.springcore.case02;

public class Emp {

    private Integer id;
    private String name;
    private CarExtends car;
    private DeptI dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarExtends getCar() {
        return car;
    }

    public void setCar(CarExtends car) {
        this.car = car;
    }

    public DeptI getDept() {
        return dept;
    }

    public void setDept(DeptI dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "id=" + id + ", name=" + name + ", car=" + car + ", dept=" + dept + '}';
    }

    

}
