package com.flipkart.restController;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Notification;

import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.CourseCapacityReached;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.RequiredCourseAdditionException;
import com.flipkart.handler.PaymentHandler;
import com.flipkart.handler.StudentHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;


@Path("/student")
public class StudentRestController {


    StudentHandler studentHandler = new StudentHandler();
    PaymentHandler paymentHandler = new PaymentHandler();

    /**
     * returns the list of courses
     *
     */
    @GET
    @Path("/registerForSemester")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> registerForSemester() {
        System.out.println("hit RegisterForSem service ===== ");
        return studentHandler.registerForSemester();

    }


    /**
     *
     * @param studentId
     * @param courseIdAdd
     * @return
     */
    @POST
    @Path("/addCourse/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCourse(@PathParam("studentId") String studentId, @QueryParam("courseId") String courseIdAdd) {

        try{
            studentHandler.addCourse(studentId,courseIdAdd);
            return Response.status(201).entity( "course added" ).build();

        } catch (RequiredCourseAdditionException e) {
            return Response.status(201).entity( e.getMessage() ).build();
        } catch (CourseAlreadyRegisteredException e) {
            return Response.status(201).entity( e.getMessage() ).build();
        } catch (CourseCapacityReached e) {
            return Response.status(201).entity( e.getMessage() ).build();
        }


    }


    /**
     *
     * @param studentId
     * @param courseIdDrop
     * @return
     */
    @POST
    @Path("/dropCourse/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response dropCourse(@PathParam("studentId") String studentId, @QueryParam("courseId") String courseIdDrop) {

        try{
            System.out.println("in drop=====");
            studentHandler.dropCourse(studentId,courseIdDrop);
            return Response.status(201).entity( "course dropped" ).build();

        } catch (CourseNotFoundException e) {
            return Response.status(502).entity( e.getMessage() ).build();
        }


    }


    /**
     *
     * @param studentId
     * @param mode
     * @return
     */
    @POST
    @Path("/payFee/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response payFee(@PathParam("studentId") String studentId, @QueryParam("mode") String mode) {

        try {
            Notification notification = paymentHandler.make_payment(studentId, mode);

            return Response.status(201).entity( notification ).build();
        } catch (SQLException throwables) {
            return Response.status(501).entity( throwables.getMessage() ).build();
        } catch (ClassNotFoundException e) {
            return Response.status(501).entity( e.getMessage() ).build();
        }

    }


    /**
     *
     * @param studentId
     * @return
     */
    @POST
    @Path("/viewGradeCard/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewGradeCard(@PathParam("studentId") String studentId) {
        System.out.println("hit viewReportCard service ===== ");

        List<Grade> studentGradeList = studentHandler.viewReportCard(studentId);
        return Response.status(201).entity( studentGradeList).build();

    }

}
