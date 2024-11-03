package com.study.springcore.case02;

public class Student {

    private Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "sid=" + sid + ", sname=" + sname + '}';
//    }

    public Student() {
        System.out.println("建構子");
    }

    public Student(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

}
