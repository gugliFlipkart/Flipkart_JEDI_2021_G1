package com.flipkart.exception;

public class RequiredCourseAdditionException extends Exception {


    public String getMessage(){

        return "you have already Added 4 primary and 2 alternate courses ";

    }

}
