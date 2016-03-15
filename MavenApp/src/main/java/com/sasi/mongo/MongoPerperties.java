package com.sasi.mongo;

import com.sasi.constants.ConstantsClass;
import com.sasi.constants.ProjectContants;
import com.sasi.exception.CustomException;

public class MongoPerperties extends MongoConnection {
  
	/**
	 * @throws CustomException
	 */
	public  static void setMongoDBProperties() throws  CustomException{
		
		try{
			if(
				ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("portNo")!=null && 
				ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("hostName")!=null &&
				ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("dbName")!=null
			   ) {
				     MongoDbBean.portNo= Integer.parseInt( ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("portNo"));
				     MongoDbBean.hostName=ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("hostName");
				     MongoDbBean.dbName=ConstantsClass.getCONSTANTS_CLASS().getProp().getProperty("dbName");
				     MongoDbBean.isRequiredNewConn=ProjectContants.FALSE;
			     }
			else{
				throw new Exception(ProjectContants.CONNECTION_ERR_MSG);
			}
				
		}catch(Exception e){
			throw new CustomException(
					new Object(){}.getClass()+"-"+new Object(){}.getClass().getEnclosingMethod().getName() , 
					ProjectContants.FALI_RESPONSE_CODE, 
					ProjectContants.DEFAULT_ERR_MSG, 
					ConstantsClass.getCONSTANTS_CLASS().getDateTimeUtilities().getDateAndTime(),
					e.getMessage()
			       );
		}
		
	}
	
	
}
