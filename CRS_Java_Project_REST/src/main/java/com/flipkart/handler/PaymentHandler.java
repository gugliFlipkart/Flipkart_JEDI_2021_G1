package com.flipkart.handler;

import com.flipkart.bean.Notification;
import com.flipkart.service.PaymentInterface;
import com.flipkart.service.PaymentService;

public class PaymentHandler {
    PaymentInterface paymentService = new PaymentService();

    public Notification make_payment(String studentId, String mode) {
        return paymentService.make_payment(studentId, mode);
    }

}
