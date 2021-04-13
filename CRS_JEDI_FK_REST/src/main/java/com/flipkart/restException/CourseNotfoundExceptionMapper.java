package com.flipkart.restException;

import com.flipkart.exception.CourseNotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class CourseNotfoundExceptionMapper implements ExceptionMapper<CourseNotFoundException> {

    @Override
    public Response toResponse(CourseNotFoundException exception) {
        System.out.println("CNF exception");
        return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();

    }
}
