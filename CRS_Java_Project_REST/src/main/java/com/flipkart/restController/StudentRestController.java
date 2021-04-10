package com.flipkart.restController;

import com.flipkart.bean.Course;
import com.flipkart.bean.Notification;
import com.flipkart.handler.PaymentHandler;
import com.flipkart.handler.StudentHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/student")
public class StudentRestController {


    StudentHandler studentHandler = new StudentHandler();
    PaymentHandler paymentHandler = new PaymentHandler();

    @GET
    @Path("/registerForSemester")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> registerForSemester() {

        return studentHandler.registerForSemester();
//        return "Hello world!";

    }


    @POST
    @Path("/payfee/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response payFee(@PathParam("studentId") String studentId, @QueryParam("mode") String mode) {

        Notification notification = paymentHandler.make_payment(studentId, mode);

        return Response.status(201).entity( notification ).build();
    }


}
