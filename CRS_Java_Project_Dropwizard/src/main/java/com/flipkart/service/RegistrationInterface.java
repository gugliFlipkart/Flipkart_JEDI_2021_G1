package com.flipkart.service;

import java.sql.SQLException;

public interface RegistrationInterface {

    /**
     *
     * @param studentId
     * @return
     * @throws SQLException
     */
    public double calculateFee(String studentId) throws SQLException;

}
