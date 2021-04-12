package com.flipkart.restController;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.clientMenu.CRSApplication;
import com.flipkart.exception.CourseAlreadyPresentInCatalogueException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.StudentIDNotValidException;
import com.flipkart.handler.AdminHandler;
import org.apache.log4j.Logger;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/admin")

public class AdminRestController {


AdminHandler adminHandler = new AdminHandler();

    /**
     * REST service for approving student registration
     * @return
     */


  @PUT
  @Path("/approveStudentRegistration")
  @Produces(MediaType.APPLICATION_JSON)
   public Response approveStudentRegistration(){
      System.out.println("hit admin approval");
        adminHandler.approveStudentRegistration();
      return Response.status(201).entity( "approved ").build();
   }

    /**
     * REST service to add course in course catalogue
     * @param course
     * sh
     */
    @POST
    @Path("/addCourse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCourses(Course course) {
      try {
          System.out.println("hit admin add course Rest");
          adminHandler.addCourses(course);
          return Response.status(201).entity("Course Added").build();
      } catch(CourseAlreadyPresentInCatalogueException | SQLException ex){
          return Response.status(501).entity(ex.getMessage()).build();
        }

    }

    /**
     * REST service to delete a particular course from course catalogue
     * @param courseId
     *
     */


    @PUT
    @Path("/dropCourse/{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response dropCourse(@PathParam("courseId") String courseId) {
      try {
          adminHandler.dropCourses(courseId);
          return Response.status(201).entity("Course Dropped").build();
      } catch(CourseNotFoundException | SQLException ex){
          return Response.status(501).entity(ex.getMessage()).build();
      }
    }

    /**
     * REST service to generate report card for the student
     * @param studentId
     * @return report card
     */


    @GET
    @Path("/generateReportCard/{studentId}")
   @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateReportCard(@PathParam("studentId") String studentId) {
      try {
         List<Grade> reportCard = adminHandler.generateReportCard(studentId);
         return Response.status(201).entity(reportCard).build();
      } catch(StudentIDNotValidException | SQLException ex){
          return Response.status(501).entity(ex.getMessage()).build();
        }

   }

}
