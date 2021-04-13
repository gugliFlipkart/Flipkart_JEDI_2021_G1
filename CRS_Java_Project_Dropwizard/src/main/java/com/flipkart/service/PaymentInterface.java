package com.flipkart.service;

import com.flipkart.bean.Notification;

import java.sql.SQLException;

public interface PaymentInterface {
    /**
     *
     * @param studentId
     * @param mode
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Notification make_payment(String studentId, String mode) throws SQLException, ClassNotFoundException;
}
