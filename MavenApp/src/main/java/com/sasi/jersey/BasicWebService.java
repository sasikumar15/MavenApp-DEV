package com.sasi.jersey;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class BasicWebService {
	//https://strongloop.com/strongblog/node-js-java-getting-started/
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
     //  return MongoProcess.findLogicSpeficValUsingBOD();
       Map<String, String> test=new HashMap<String, String>();
       test.put("tes", "1");
       test.put("tes", "1");
 	   return test.toString();
       
	}
}
