package com.study.springcore.case04.tx_xml.service;

import java.util.List;

public interface Cashier {

    void checkOut(List<Integer> bids, Integer uid);

}
