package com.flipkart.service;

import com.flipkart.bean.Notification;

public interface PaymentInterface {
    public Notification make_payment(String studentId, String mode);
}
