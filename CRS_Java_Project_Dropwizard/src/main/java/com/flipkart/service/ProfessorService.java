package com.flipkart.service;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.dao.ProfessorDao;
import com.flipkart.dao.ProfessorDaoInterface;
import com.flipkart.dummyDao.DummyCourseCatalogueDB;
import com.flipkart.dummyDao.DummyGradesDB;
import com.flipkart.exception.ProfessorAlreadyAssignedException;

import java.sql.SQLException;
import java.util.List;

public class ProfessorService implements ProfessorInterface {


    /**
     * singleton
     */
    private static volatile ProfessorService instance = null;
    public static ProfessorService getInstance() {
        if (instance == null) {
            synchronized (ProfessorService.class) {
                instance = new ProfessorService();
            }
        }
        return instance;
    }

//    DummyGradesDB dummyGradesDB =  DummyGradesDB.getInstance();
//    DummyCourseCatalogueDB dummyCourseCatalogueDB =  DummyCourseCatalogueDB.getInstance();

    ProfessorDaoInterface professorDaoInterface =  ProfessorDao.getInstance();


    @Override
    public void addGrades(Grade grade) throws SQLException {
        professorDaoInterface.addGrades(grade);


    }

    @Override
    public List<Student> viewEnrolledStudent(String courseId) throws SQLException {
        return  professorDaoInterface.fetchEnrolledStudent(courseId);


    }

    @Override
    public void addCoursesToTeach(String professorId, String courseId) throws ProfessorAlreadyAssignedException {
        professorDaoInterface.addCoursesToTeach(professorId,courseId);


    }
}