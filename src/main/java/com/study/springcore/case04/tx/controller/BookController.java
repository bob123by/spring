package com.study.springcore.case04.tx.controller;

import com.study.springcore.case04.tx.service.BookService;
import com.study.springcore.case04.tx.service.Cashier;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private Cashier cashier;

    public void buyBook() {
        bookService.buyBook(1, 1001);
    }

    public void checkOut() {
        List<Integer> bids = new ArrayList<>();
        bids.add(1);
        bids.add(2);
        cashier.checkOut(bids, 1001);
    }

}
