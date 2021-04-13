package com.flipkart.restController;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.ProfessorAlreadyAssignedException;
import com.flipkart.handler.ProfessorHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;


@Path("/professor")
public class ProfessorRestController {

    ProfessorHandler professorHandler = new ProfessorHandler();

    /**
     *
     * @param professorId
     * @param courseId
     * @return
     */
    @POST
    @Path("/addcourse/{professorId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCoursesToTeach(@PathParam("professorId") String professorId, @QueryParam("courseId") String courseId) {

        try {
            professorHandler.addCoursesToTeach(professorId, courseId);
            return Response.status(201).entity("Course Added Successfully").build();
        } catch (Exception e) {
            return Response.status(501).entity(e.getMessage()).build();
        }

    }

    /**
     *
     * @param courseId
     * @return
     */
    @POST
    @Path("/viewstudents/{courseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewStudents(@PathParam("courseId") String courseId)  {


        List<Student> courseStudentList = null;
        try {
            courseStudentList = professorHandler.ViewStudents(courseId);
            return Response.status(201).entity( courseStudentList ).build();
        } catch (Exception e) {
            return Response.status(501).entity(e.getMessage()).build();
        }


    }

    /**
     *
     * @param grade
     * @return
     */
    @POST
    @Path("/addgrades")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addGrades(Grade grade) {

        try {
            professorHandler.addGrades(grade);
            return Response.status(201).entity( "Grades Added Successfully").build();
        } catch (Exception e) {
            return Response.status(501).entity(e.getMessage()).build();
        }


    }




}
