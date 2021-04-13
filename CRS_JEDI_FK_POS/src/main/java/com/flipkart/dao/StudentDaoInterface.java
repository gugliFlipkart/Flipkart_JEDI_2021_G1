package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.CourseCapacityReached;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.RequiredCourseAdditionException;

import java.sql.SQLException;
import java.util.List;

/**
 * Interface for Student Dao
 * @return
 */

public interface StudentDaoInterface {

    /**
     *
     * @return
     */
    public List<Course> registerForSemester();

    /**
     *
     * @param studentId
     * @param courseId
     * @return
     * @throws RequiredCourseAdditionException
     * @throws CourseCapacityReached
     * @throws CourseAlreadyRegisteredException
     */
    public boolean addCourse(String studentId, String courseId) throws RequiredCourseAdditionException, CourseCapacityReached, CourseAlreadyRegisteredException;

    /**
     *
     * @param studentId
     * @param courseId
     * @return
     * @throws CourseNotFoundException
     */
    public boolean dropCourse(String studentId, String courseId) throws CourseNotFoundException;

    /**
     *
     * @param student
     * @return
     */
    public List<Grade> viewReportCard(String student);

    /**
     *
     * @param studentId
     * @param password
     * @throws SQLException
     */
    public void studentRegistration(String studentId, String password) throws SQLException;


}
