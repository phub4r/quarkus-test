package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Todo {

    private Point point;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {

        return String.format("hello my friend, x: " + point.getX() );
    }
}
