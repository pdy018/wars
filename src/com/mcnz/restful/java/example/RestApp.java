
package com.mcnz.restful.java.example;

import java.io.IOException;

import javax.ws.rs.*;
 
@Path("/")
public class RestApp {

	@GET
	@Path("/score")
	@Produces("text/plain")
	public String Rest() {

		String a="mvn clean install -Plive -Dkubernetes.api.endpoint=http://192.168.1.100:8080/api/v1beta1/ -Ddocker.image=busybox";
		    	try {
		        	Runtime.getRuntime().exec("cmd /k start mvn clean install -Plive -Dkubernetes.api.endpoint=http://192.168.1.100:8080/api/v1beta1/ -Ddocker.image=busybox");
		    		//Runtime.getRuntime().exec("cmd /k start FOR /f \"tokens=*\" %i IN ('docker-machine env -u') DO @%i");
//		    		String command= "/usr/bin/xterm";
//		    		Runtime rt = Runtime.getRuntime();
//		    		Process pr = rt.exec(command);
		    	
		    	
		    	} catch (IOException e) {        
		               e.printStackTrace();
		             
	}
				return a;
   
	}

	
}
