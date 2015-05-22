#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Named
@Path ( "/" )
public class HelloEndpoint {

    @GET
    public String hello() {
        return "Hello World!";
    }
}
