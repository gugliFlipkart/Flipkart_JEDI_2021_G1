package com.flipkart.restController;

import org.glassfish.jersey.server.ResourceConfig;
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig ()  {

        register(StudentRestController.class);
//        register(UserRestAPI.class);
        register(ProfessorRestController.class);
        register(AdminRestController.class);
//        packages("com.flipkart.restController");

    }
}
