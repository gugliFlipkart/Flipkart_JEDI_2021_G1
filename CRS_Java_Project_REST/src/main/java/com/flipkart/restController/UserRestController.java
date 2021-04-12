package com.flipkart.restController;


import com.flipkart.bean.Course;
import com.flipkart.bean.User;
import com.flipkart.handler.AuthenticationHandler;
import com.flipkart.handler.StudentHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/user")
public class UserRestController {

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(User user) {
        System.out.println("hit Login service ===== ");
//        return studentHandler.registerForSemester();
//        return "Hello world!";
        AuthenticationHandler authenticationHandler = new AuthenticationHandler();

        String userType = authenticationHandler.callAuthService(user.getUsername(), user.getPassword()) ;
        if(userType!=null){
            return Response.status(201).entity( "logged IN" ).build();
        }
        return Response.status(201).entity( "Invalid details" ).build();

    }


    @POST
    @Path("/studentRegistration")
    @Produces(MediaType.APPLICATION_JSON)
    public Response studentRegistration(User user) {
        System.out.println("hit RegisterForSem service ===== ");
//        return studentHandler.registerForSemester();
//        return "Hello world!";
        StudentHandler studentHandler = new StudentHandler();
        try {
            studentHandler.studentRegistration(user.getUsername(), user.getPassword());
            return Response.status(201).entity( "student id added .. waiting for approval" ).build();
        } catch (Exception e) {
            return Response.status(501).entity( e.getMessage() ).build();
        }


    }


}
