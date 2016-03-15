package com.sasi.constants;

import java.util.Properties;

import com.sasi.date.DateTimeUtilities;
import com.sasi.exception.CustomException;
import com.sasi.json.JsonConvertion;
import com.sasi.propertyfile.PropertyService;

public class ConstantsClass {
	public   static ConstantsClass CONSTANTS_CLASS;
	private  DateTimeUtilities dateTimeUtilities;
	private  PropertyService propertyService; 
	private  Properties prop; 
	private  JsonConvertion jsonConvertion;
	
	public ConstantsClass() throws CustomException{
		dateTimeUtilities=new DateTimeUtilities();
		propertyService=new PropertyService();
		prop=new Properties();
		jsonConvertion=new JsonConvertion();
	}
	
	public static ConstantsClass getCONSTANTS_CLASS() {
		return CONSTANTS_CLASS;
	}
	public DateTimeUtilities getDateTimeUtilities() {
		return dateTimeUtilities;
	}
	public PropertyService getPropertyService() {
		return propertyService;
	}
	public Properties getProp() {
		return prop;
	}
	public JsonConvertion getJsonConvertion() {
		return jsonConvertion;
	}
}
