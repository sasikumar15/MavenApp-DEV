package com.sasi.staticbeans.vlaues;

import com.sasi.main.InitialLoading;
import com.sasi.mongo.MongoProcess;
public class Main {

	public static void main(String[] args) {
		InitialLoading.setInitialize();
	//	MongoProcess.saveManyDocuUsingBasicDBObj();
		
	//	List<ClaimBean> listOfVal =BeanValues.getListOfClaimBeanValue();
	//	String jsonValues=ConstantsClass.getCONSTANTS_CLASS().getJsonConvertion().toJSon(listOfVal);
	 //   System.out.println(jsonValues);
	 //   MongoProcess.saveJsonDocuUsingBasicDBObj(jsonValues);
	    
     // MongoProcess.retriveAllDocusUsingBasicDbObj();
	
     //  MongoProcess.retriveSpeficFieldValUusingBDO();	
		
		//MongoProcess.findSpeficValUsingBDO();
		
	///	MongoProcess.findLogicSpeficValUsingBOD();
	
		 MongoProcess.updateDocusUsingBOD();
	
	}
	
	
	
}
