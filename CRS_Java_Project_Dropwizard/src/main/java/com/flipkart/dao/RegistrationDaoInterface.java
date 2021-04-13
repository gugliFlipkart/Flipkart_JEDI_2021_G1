package com.flipkart.dao;

import java.sql.SQLException;

public interface RegistrationDaoInterface {
    /**
     *
     * @param studentId
     * @return
     * @throws SQLException
     */
    public double calculateFee(String studentId) throws SQLException;
}
