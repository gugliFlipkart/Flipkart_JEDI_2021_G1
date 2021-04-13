package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.CourseCapacityReached;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.RequiredCourseAdditionException;


import java.sql.SQLException;
import java.util.List;

/**
 * Interface for student service
 */

public interface StudentInterface {


    /**
     *
     * @param student
     * @return
     */
    public List<Grade> viewReportCard(String student);

    /**
     *
     * @return course list
     */
    public List<Course> registerForSemester();

    /**
     *
     * @param student
     * @param courseId
     * @throws CourseAlreadyRegisteredException
     * @throws RequiredCourseAdditionException
     * @throws CourseCapacityReached
     */
    public void addCourse(String student, String courseId) throws CourseAlreadyRegisteredException, RequiredCourseAdditionException, CourseCapacityReached;

    /**
     *
     * @param student
     * @param courseId
     * @throws CourseNotFoundException
     */
    public void dropCourse(String student, String courseId) throws CourseNotFoundException;

    /**
     *
     * @param student
     * @param mode
     * @return
     */
    public boolean payFee(Student student, int mode);

    /**
     *
     * @param userId
     * @param password
     * @throws SQLException
     */
    public void studentRegistration(String userId, String password) throws SQLException;

}
