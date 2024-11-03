package com.study.springcore.case01;

public class Person {

    private Integer id;
    private String name;
    private Man man;

    public Person(Integer id, String name, Man man) {
        this.id = id;
        this.name = name;
        this.man = man;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", man=" + man + '}';
    }

    

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
}

