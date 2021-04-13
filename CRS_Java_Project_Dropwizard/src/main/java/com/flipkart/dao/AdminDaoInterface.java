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
     * approve Students
     */
    public void approveStudentRegistration();

    /**
     *
     * @param course
     * @throws CourseAlreadyPresentInCatalogueException
     * @throws SQLException
     */
    public void addCourses(Course course) throws CourseAlreadyPresentInCatalogueException, SQLException;

    /**
     *
     * @param courseId
     * @throws CourseNotFoundException
     * @throws SQLException
     */
    public void dropCourses(String courseId) throws CourseNotFoundException, SQLException;

    /**
     *
     * @param studentId
     * @return
     * @throws StudentIDNotValidException
     * @throws SQLException
     */
    public List<Grade> generateReportCard(String studentId) throws StudentIDNotValidException, SQLException;

}
