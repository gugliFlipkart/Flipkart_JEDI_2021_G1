package com.flipkart.dao;

import com.flipkart.constant.ModeOfPayment;

import java.sql.SQLException;

public interface PaymentDaoInterface {
    void make_payment(String studentId, String modeOfPayment, double amt) throws ClassNotFoundException, SQLException;
}
