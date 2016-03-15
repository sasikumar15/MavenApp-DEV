package com.sasi.main;

import com.sasi.constants.ConstantsClass;
import com.sasi.exception.CustomException;
import com.sasi.mongo.MongoPerperties;

public class InitialLoading{
  
	 public static void setInitialize(){
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
