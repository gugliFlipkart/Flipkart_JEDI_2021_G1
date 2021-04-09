package com.flipkart.restController;

import com.flipkart.bean.Course;
import com.flipkart.handler.StudentHandler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/student")
public class StudentRestController {


    StudentHandler studentHandler = new StudentHandler();

    @GET
    @Path("/registerForSemester")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> registerForSemester() {

        return studentHandler.registerForSemester();
//        return "Hello world!";

    }


}
