package ictmsa.msaapp.service;


import entity.BookMaster;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.DataModel;


@Path("/example")
public class ExampleService {
    
    @Inject DataModel model;
   

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("Admin")
    public String sayHello() {
        return "Hello, world with Public and Private Keys!";
    }
    
    @GET
    @Path("getbooks")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("Admin")
    public Collection<BookMaster> getBooks()
    {
        return model.getAllBooks();
    }
    
    
   
}
