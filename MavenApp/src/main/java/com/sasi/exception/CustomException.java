package com.sasi.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	private String exceptionPlace;
	private int responseId; 
	private String responseMsg;
	private String dateAndTime;
	
	public CustomException(String exceptionPlace, int responseId,String responseMsg, String dateAndTime, String exceptionMsg){
		super(exceptionMsg);
		this.exceptionPlace = exceptionPlace;
		this.responseId=responseId;
		this.responseMsg=responseMsg;
		this.dateAndTime=dateAndTime;
	}
	public String getExceptionPlace() {
		return exceptionPlace;
	}
	public int getResponseId() {
		return responseId;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
}

