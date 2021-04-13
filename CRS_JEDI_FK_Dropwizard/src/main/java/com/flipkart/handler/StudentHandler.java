package com.flipkart.handler;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.CourseCapacityReached;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.RequiredCourseAdditionException;
import com.flipkart.service.StudentInterface;
import com.flipkart.service.StudentService;


import java.sql.SQLException;
import java.util.List;


/**
 * handler class for student
 */
public class StudentHandler {


    StudentInterface studentServiceInterface = StudentService.getInstance();

    /**
     *
     * @return list of courses
     */
    public List<Course> registerForSemester(){

        return studentServiceInterface.registerForSemester();


    }

    /**
     *
     * @param studentid
     * @param courseId
     * @throws CourseAlreadyRegisteredException
     * @throws RequiredCourseAdditionException
     * @throws CourseCapacityReached
     */
    public void addCourse(String studentid, String courseId) throws CourseAlreadyRegisteredException, RequiredCourseAdditionException, CourseCapacityReached {
        studentServiceInterface.addCourse(studentid,courseId);

    }

    /**
     *
     * @param studentId
     * @param courseId
     * @throws CourseNotFoundException
     */
    public void dropCourse(String studentId, String courseId) throws CourseNotFoundException {
        studentServiceInterface.dropCourse(studentId,courseId);
    }


    /**
     *
     * @param student
     * @param mode
     * @return
     */
    public boolean payFee(Student student, int mode){
        studentServiceInterface.payFee(student, mode);

        return false;
    }


    /**
     *
     * @param studentId
     * @return
     */
    public List<Grade> viewReportCard(String studentId){

        return studentServiceInterface.viewReportCard(studentId);
    }

    /**
     *
     * @param studentId
     * @param password
     * @throws SQLException
     */
    public void studentRegistration(String studentId, String password) throws SQLException {

        studentServiceInterface.studentRegistration(studentId, password);

    }




}
