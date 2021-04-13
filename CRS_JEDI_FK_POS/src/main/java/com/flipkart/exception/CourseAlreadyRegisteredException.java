package com.flipkart.exception;


/**
 * Exception raised when a student tries to register for the course he has already selected / registered for.
 */

public class CourseAlreadyRegisteredException extends Exception {

    String courseId;
    public CourseAlreadyRegisteredException(String courseId){
        this.courseId = courseId;
    }

    @Override
    public String getMessage(){
        return "You have already registered for " + courseId;
    }

}