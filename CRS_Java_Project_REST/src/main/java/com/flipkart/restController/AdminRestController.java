package com.flipkart.restController;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.handler.AdminHandler;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/admin")

public class AdminRestController {

AdminHandler adminHandler = new AdminHandler();

  @PUT
  @Path("/approveStudentRegistration")
  @Produces(MediaType.APPLICATION_JSON)
   public Response approveStudentRegistration(){
        adminHandler.approveStudentRegistration();
      return Response.status(201).entity( "approved ").build();
   }


    @POST
    @Path("/addCourse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addCourses(Course course) {
        adminHandler.addCourses(course);
    }

    @PUT
    @Path("/dropCourse/{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void dropCourse(@PathParam("courseId") String courseId) {
        adminHandler.dropCourses(courseId);
    }




    @GET
    @Path("/generateReportCard/{studentId}")
   @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Grade> generateReportCard(@PathParam("studentId") String studentId){
      return adminHandler.generateReportCard(studentId);

   }

}
