package com.flipkart.service;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.ProfessorAlreadyAssignedException;

import java.sql.SQLException;
import java.util.List;

public interface ProfessorInterface {

    public void addGrades(Grade grade) throws SQLException;
    public List<Student> viewEnrolledStudent(String courseId) throws SQLException;
    public void addCoursesToTeach(String professorId,String courseId) throws ProfessorAlreadyAssignedException;
}
