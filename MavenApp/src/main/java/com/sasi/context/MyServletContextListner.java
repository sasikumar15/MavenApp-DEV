package com.sasi.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sasi.constants.ConstantsClass;
import com.sasi.exception.CustomException;
import com.sasi.mongo.MongoPerperties;

public class MyServletContextListner implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		 try {
             ConstantsClass.CONSTANTS_CLASS=new ConstantsClass();   
             ConstantsClass.CONSTANTS_CLASS.getPropertyService().readPropertyValues();
			 MongoPerperties.setMongoDBProperties();
			}
			catch (CustomException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getExceptionPlace());
				System.out.println(e.getDateAndTime());
			}
	}

	
}
