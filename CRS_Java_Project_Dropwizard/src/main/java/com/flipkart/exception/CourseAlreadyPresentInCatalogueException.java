package com.flipkart.exception;


/**
 * Exception which is raised when admin tries to add a course in the course catalogue
 * and that course is already present in the course catalogue.
 */

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