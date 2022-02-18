/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import entity.BookMaster;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import token.GenerateToken;

/**
 *
 * @author root
 */
// appcontainer is the name of docker container
@RegisterRestClient(baseUri = "http://appcontainer:8080/MSAApp/rest/example")

//@RegisterRestClient(configKey = "myclient")
public interface MyServiceClient {
    
    @ClientHeaderParam(name = "authorization", value = "{generateJWT}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello();
    
    
    @ClientHeaderParam(name = "authorization", value = "{generateJWT}")
    @GET
    @Path("getbooks")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<BookMaster> getBooks();
    
    
   
    default String generateJWT()
    {
        Config config = ConfigProvider.getConfig();
      //  String jwt = "Bearer "+ config.getValue("jwt-string", String.class );
      String jwt = "Bearer "+ GenerateToken.generateJWT();
        return jwt;
    }
   
} 
