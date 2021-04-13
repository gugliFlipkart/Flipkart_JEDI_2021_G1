package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.dao.AdminDao;
import com.flipkart.dao.AdminDaoInterface;
import com.flipkart.dao.ProfessorDao;
import com.flipkart.dao.ProfessorDaoInterface;
import com.flipkart.exception.CourseAlreadyPresentInCatalogueException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.StudentIDNotValidException;

import java.sql.SQLException;
import java.util.List;

public class AdminService implements AdminServiceInterface {


    /**
     * singleton class
     */
    private static volatile AdminService instance = null;
    public static AdminService getInstance() {
        if (instance == null) {
            synchronized (AdminService.class) {
                instance = new AdminService();
            }
        }
        return instance;
    }

    AdminDaoInterface adminDaoInterface = AdminDao.getInstance();


    /**
     * Method used by admin to approve student registration
     */
    @Override
    public void approveStudentRegistration() {
        adminDaoInterface.approveStudentRegistration();
    }

    /**
     * Method used by admin to add course in the course catalogue
    /**
     *
     * @param course
     * @throws CourseAlreadyPresentInCatalogueException
     * @throws SQLException
     */

    @Override
    public void addCourses (Course course) throws CourseAlreadyPresentInCatalogueException, SQLException {
        adminDaoInterface.addCourses(course);
    }


    /**
     * @param courseId
     * @throws CourseNotFoundException
     * @throws SQLException
     */

    @Override
    public void dropCourses(String courseId) throws CourseNotFoundException, SQLException {
         adminDaoInterface.dropCourses(courseId);
    }

    /**
     *
     * @param studentId
     * @return
     * @throws StudentIDNotValidException
     * @throws SQLException
     */
    @Override
    public List<Grade> generateReportCard(String studentId) throws StudentIDNotValidException, SQLException {
        return adminDaoInterface.generateReportCard(studentId);
    }

}
