package com.study.springcore.case01;

public class Man {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" + "name=" + name + ", age=" + age + '}';
    }

    public Man() {
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
