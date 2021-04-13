package com.flipkart.handler;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseAlreadyPresentInCatalogueException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.StudentIDNotValidException;
import com.flipkart.service.AdminService;
import com.flipkart.service.AdminServiceInterface;
import com.flipkart.service.ProfessorInterface;
import com.flipkart.service.ProfessorService;

import java.sql.SQLException;
import java.util.List;

/**
 * handler class for admin
 */

public class AdminHandler {


    AdminServiceInterface adminService= AdminService.getInstance();


    public void approveStudentRegistration(){
        adminService.approveStudentRegistration();
    }

    public void addCourses(Course course) throws CourseAlreadyPresentInCatalogueException, SQLException {
        adminService.addCourses(course);
    }

     public void dropCourses(String courseId) throws CourseNotFoundException, SQLException {
        adminService.dropCourses(courseId);
     }
    public List<Grade> generateReportCard(String studentId) throws StudentIDNotValidException, SQLException {

        return  adminService.generateReportCard(studentId);


    }


}