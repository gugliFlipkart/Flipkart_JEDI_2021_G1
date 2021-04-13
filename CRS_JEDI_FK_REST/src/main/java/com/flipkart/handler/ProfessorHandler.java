package com.flipkart.handler;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.ProfessorAlreadyAssignedException;
import com.flipkart.service.ProfessorInterface;
import com.flipkart.service.ProfessorService;

import java.sql.SQLException;
import java.util.List;

/**
 * handler class for professor
 */

public class ProfessorHandler {

    ProfessorInterface professorService = ProfessorService.getInstance();

    public void addCoursesToTeach(String professorId, String courseId) throws ProfessorAlreadyAssignedException {

        professorService.addCoursesToTeach(professorId, courseId);
    }


    public void addGrades(Grade grade) throws SQLException {
        professorService.addGrades(grade);
    }


    public List<Student> ViewStudents(String courseId) throws SQLException {

        return  professorService.viewEnrolledStudent(courseId);


    }


}
