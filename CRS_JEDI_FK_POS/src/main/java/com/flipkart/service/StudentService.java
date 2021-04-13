package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.dao.StudentDao;
import com.flipkart.dao.StudentDaoInterface;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.CourseCapacityReached;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.RequiredCourseAdditionException;


import java.sql.SQLException;
import java.util.List;

/**
 * Mathods of this class communicate with dao layer
 */
public class StudentService implements StudentInterface {

    /**
     * singleton
     */
    private static volatile StudentService instance = null;
    public static StudentService getInstance() {
        if (instance == null) {
            synchronized (StudentService.class) {
                instance = new StudentService();
            }
        }
        return instance;
    }

    StudentDaoInterface studentDaoInterface = StudentDao.getInstance();

    /**
     *
     * @return course list
     */
    public List<Course> registerForSemester(){

        return studentDaoInterface.registerForSemester();
    }


    /**
     *
     * @param studentId
     * @param courseId
     * @throws CourseAlreadyRegisteredException
     * @throws RequiredCourseAdditionException
     * @throws CourseCapacityReached
     */
    public void addCourse(String studentId, String courseId) throws CourseAlreadyRegisteredException, RequiredCourseAdditionException, CourseCapacityReached {

        studentDaoInterface.addCourse(studentId,courseId);

    }

    /**
     *
     * @param studentId
     * @param courseId
     * @throws CourseNotFoundException
     */
    public void dropCourse(String studentId, String courseId) throws CourseNotFoundException {
        studentDaoInterface.dropCourse(studentId,courseId);

    }


    /**
     *
     * @param student
     * @param mode
     * @return
     */
    public boolean payFee(Student student, int mode){

        // if all course resgistration successfull than only can this fn be called
        //calls bankApi to do payment and get payment status
        boolean status = true;// dummy

        // this status is sent to studentdao.payfeeStatusUpdate
        // this updates db payment status

        return status;

    }

    /**
     *
     * @param studentId
     * @return
     */
    public List<Grade> viewReportCard(String studentId){
        return studentDaoInterface.viewReportCard(studentId);

    }


    /**
     *
     * @param studenntId
     * @param password
     * @throws SQLException
     */
    public void studentRegistration(String studenntId, String password) throws SQLException {

        studentDaoInterface.studentRegistration(studenntId, password);


    }

}
