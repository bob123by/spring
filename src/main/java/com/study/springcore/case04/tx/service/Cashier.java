package com.study.springcore.case04.tx.service;

import java.util.List;

public interface Cashier {

    void checkOut(List<Integer> bids, Integer uid);

}
