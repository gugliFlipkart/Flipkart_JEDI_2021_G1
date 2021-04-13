package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.exception.StudentIDNotValidException;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class AdminServiceTest {


    @Test
    public void testGenerateReportCard() {
        System.out.println("sss");
        AdminServiceInterface adminServiceInterface = new AdminService();
/*
        try {
            List<Grade> gradeList = adminServiceInterface.generateReportCard("S101");
//            Assert.assertEquals(gradeList.size(), 3);

//            Assert.assertEquals(gradeList.get(0).getGradeObtained(),);


        } catch (StudentIDNotValidException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
*/

    }

    @Test
    public void addCourse() {
    Course course = new Course();


    }



}
