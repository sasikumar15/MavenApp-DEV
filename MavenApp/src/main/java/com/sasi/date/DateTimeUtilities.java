package com.sasi.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sasi.constants.ProjectContants;

public class DateTimeUtilities {
	private static DateFormat dateFormat = new SimpleDateFormat(ProjectContants.DEFALUT_SIMPLE_DATE_FORMAT);
	private static Date date = new Date();
	
	/**
	 * @return
	 * with default simple format 
	 */
	public String getDateAndTime(){
	 String dateAndTime;
	 dateAndTime=dateFormat.format(date);
	 return dateAndTime;
	}
	 
	/**
	 * @return
	 */
	public String getNewSDFDateAndTime(){
		String dateAndTime;
		if(ProjectContants.RUNTIME_SIMPLE_DATE_FORMAT!=null){
			DateFormat dateFormat = new SimpleDateFormat(ProjectContants.RUNTIME_SIMPLE_DATE_FORMAT);
			dateAndTime=dateFormat.format(date);
		}
		else{ 
			dateAndTime=getDateAndTime();
		}
		return dateAndTime;
	}
	
}
