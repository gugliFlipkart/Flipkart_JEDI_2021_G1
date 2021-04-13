package com.flipkart.handler;

import com.flipkart.bean.Notification;
import com.flipkart.service.PaymentInterface;
import com.flipkart.service.PaymentService;

import java.sql.SQLException;

public class PaymentHandler {
    PaymentInterface paymentService = new PaymentService();

    /**
     *
     * @param studentId
     * @param mode
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Notification make_payment(String studentId, String mode) throws SQLException, ClassNotFoundException {
        return paymentService.make_payment(studentId, mode);
    }

}
