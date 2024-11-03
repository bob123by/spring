package com.study.springcore.case04.tx_xml;


import com.study.springcore.case04.tx_xml.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("book_xml.xml");
        BookController bookController = ac.getBean("bookController", BookController.class);
        bookController.buyBook();
        //bookController.checkOut();
    }

}
