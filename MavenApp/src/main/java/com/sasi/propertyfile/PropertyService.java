package com.sasi.propertyfile;

import java.io.InputStream;

import com.sasi.constants.ConstantsClass;
import com.sasi.constants.ProjectContants;
import com.sasi.exception.CustomException;

public class PropertyService {
    /**
     * @throws CustomExcepstion
     */
    public void readPropertyValues() throws  CustomException{
		try {
			//InputStream in  = new FileInputStream("F:\\Work space\\Maven\\mongoDBApplication\\src\\main\\java\\resources\\config.properties");
			InputStream in = this.getClass().getClassLoader().getResourceAsStream(ProjectContants.DEFAULT_PROPERTY_FILE_NAME);
			synchronized (this) {
			     ConstantsClass.getCONSTANTS_CLASS().getProp().load(in);	
			}
		}catch (Exception e) {
			throw new CustomException(
					new Object(){}.getClass()+"-"+new Object(){}.getClass().getEnclosingMethod().getName() , 
					ProjectContants.FALI_RESPONSE_CODE, 
					ProjectContants.DEFAULT_ERR_MSG, 
					ConstantsClass.getCONSTANTS_CLASS().getDateTimeUtilities().getDateAndTime(),
					e.getMessage()
			       );
		};
	}
}
