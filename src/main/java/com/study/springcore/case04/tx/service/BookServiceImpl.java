package com.study.springcore.case04.tx.service;

import com.study.springcore.case04.tx.dao.BookDao;
import com.study.springcore.case04.tx.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW, timeout = 3, noRollbackFor = {NullPointerException.class, MyException.class})
    @Override
    public void buyBook(Integer bid, Integer uid) {
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateSt(bid);
        bookDao.updateBalance(uid, price);
    }

}