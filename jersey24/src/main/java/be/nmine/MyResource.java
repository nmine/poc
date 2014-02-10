package be.nmine;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.glassfish.jersey.internal.PropertiesDelegate;
import org.glassfish.jersey.server.ContainerRequest;

import be.nmine.domain.MyBean;
import be.nmine.domain.UserContext;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public MyBean getIt(@PathParam("enterpriseNumber") String enterpriseNumber, @QueryParam("fullHistory") boolean fullHistory, @BeanParam UserContext userContext) {
        MyBean myBean = new MyBean();
        myBean.setAnyNumber(1);
        myBean.setAnyString("1");
		return myBean;
    }
    
    @POST
    public MyBean postIt(MyBean myBean) {
    	return myBean;
    }
    
}
