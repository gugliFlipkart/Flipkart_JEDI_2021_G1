package com.flipkart.restController;

import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.handler.ProfessorHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/professor")
public class ProfessorRestController {

    ProfessorHandler professorHandler = new ProfessorHandler();


    @POST
    @Path("/addcourse/{professorId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCoursesToTeach(@PathParam("professorId") String professorId, @QueryParam("courseId") String courseId) {

        professorHandler.addCoursesToTeach(professorId,courseId);
        return Response.status(201).entity( "Course Added Successfully").build();

    }

    @GET
    @Path("/viewstudents")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewStudents(@QueryParam("courseId") String courseId){
        List<Student> courseStudentList = professorHandler.ViewStudents(courseId);
        return Response.status(201).entity( courseStudentList ).build();

    }

    @POST
    @Path("/addgrades")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addGrades(Grade grade) {

        professorHandler.addGrades(grade);
        return Response.status(201).entity( "Grades Added Successfully").build();

    }




}
