package com.flipkart.dao;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.ProfessorAlreadyAssignedException;

import java.sql.SQLException;
import java.util.List;

public interface ProfessorDaoInterface  {

    /**
     * Interface for professor dao
     * @param grade
     */

    public void addGrades(Grade grade) throws SQLException;
    public List<Student> fetchEnrolledStudent(String courseId) throws SQLException;
    public void addCoursesToTeach(String professorId,String courseId) throws ProfessorAlreadyAssignedException;
}
