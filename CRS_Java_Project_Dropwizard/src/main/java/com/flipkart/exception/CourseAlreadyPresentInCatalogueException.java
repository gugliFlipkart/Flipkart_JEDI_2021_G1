package com.flipkart.exception;

<<<<<<< HEAD
/**
 * Exception which is raised when admin tries to add a course in the course catalogue
 * and that course is already present in the course catalogue.
 */
=======

>>>>>>> 398899baaf948dbbcab22f9dee8087e0a4cf8d56
public class CourseAlreadyPresentInCatalogueException extends Exception{
    String courseId;
    public CourseAlreadyPresentInCatalogueException(String courseId){
        this.courseId = courseId;
    }
    @Override
    public String getMessage(){
        return courseId + " already present in Course Catalogue.";
    }
}