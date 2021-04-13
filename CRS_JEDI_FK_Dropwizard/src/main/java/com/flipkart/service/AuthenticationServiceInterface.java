package com.flipkart.service;

import com.flipkart.bean.Student;

/***
 * Interface for Authentication service
 */

public interface AuthenticationServiceInterface {

    /**
     *
     * @param userId
     * @param password
     * @return
     */
    public String validateCredentials(String userId, String password);

}
