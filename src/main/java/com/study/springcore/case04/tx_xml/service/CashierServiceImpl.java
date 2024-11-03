package com.study.springcore.case04.tx_xml.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CashierServiceImpl implements Cashier {

    @Autowired
    private BookService bookService;

    @Override
    public void checkOut(List<Integer> bids, Integer uid) {
        for (Integer bid : bids) {
            bookService.buyBook(bid, 1001);
        }
    }

}