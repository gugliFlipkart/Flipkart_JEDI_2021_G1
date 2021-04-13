package com.flipkart.dao;

import com.flipkart.bean.Notification;

import java.sql.SQLException;

public interface NotificationDaoInterface {
    /**
     *
     * @param transactionId
     * @param studentId
     * @param message
     * @param amount
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void sendNotification(String transactionId, String studentId, String message, double amount) throws ClassNotFoundException, SQLException;
}
