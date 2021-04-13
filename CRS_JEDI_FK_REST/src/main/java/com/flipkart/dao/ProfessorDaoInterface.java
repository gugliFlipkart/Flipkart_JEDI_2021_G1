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

    /**
     *
     * @param grade
     * @throws SQLException
     */
    public void addGrades(Grade grade) throws SQLException;

    /**
     *
     * @param courseId
     * @return
     * @throws SQLException
     */
    public List<Student> fetchEnrolledStudent(String courseId) throws SQLException;

    /**
     *
     * @param professorId
     * @param courseId
     * @throws ProfessorAlreadyAssignedException
     */
    public void addCoursesToTeach(String professorId,String courseId) throws ProfessorAlreadyAssignedException;
}
