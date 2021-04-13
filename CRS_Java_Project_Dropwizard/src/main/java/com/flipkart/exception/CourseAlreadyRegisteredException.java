package com.flipkart.exception;

<<<<<<< HEAD
/**
 * Exception raised when a student tries to register for the course he has already selected / registered for.
 */

=======
>>>>>>> 398899baaf948dbbcab22f9dee8087e0a4cf8d56
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