package com.flipkart.exception;

public class StudentIDNotValidException extends Exception{

    public String getMessage(){
        return "The entered student ID is not valid! Please enter the correct student ID.";
    }

}
