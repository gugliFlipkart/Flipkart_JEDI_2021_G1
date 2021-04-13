package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseAlreadyPresentInCatalogueException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.StudentIDNotValidException;

import java.sql.SQLException;
import java.util.List;

public interface AdminDaoInterface {

    /**
     * Interface for Admin Dao
     *
     */



    /**
     * Method used by admin to approve student registration
     */

    public void approveStudentRegistration();


  /**
   * Method used by admin to add course in the course catalogue
   * @param course
   * @throws CourseAlreadyPresentInCatalogueException
   * @throws SQLException
   */


    public void addCourses(Course course) throws CourseAlreadyPresentInCatalogueException, SQLException;



/**
 * Method used by admin to delete a course from course catalogue
 * @param courseId
 * @throws CourseNotFoundException
 * @throws SQLException
 */



    public void dropCourses(String courseId) throws CourseNotFoundException, SQLException;

    /**
     * Method used by admin to generate the given Student's report card
     * @param studentId
     * @return
     * @throws StudentIDNotValidException
     * @throws SQLException
     */


    public List<Grade> generateReportCard(String studentId) throws StudentIDNotValidException, SQLException;

}
