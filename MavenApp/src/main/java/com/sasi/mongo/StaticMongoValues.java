package com.sasi.mongo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBObject;

public class StaticMongoValues {

	public static BasicDBObject getBasicDataObjVal(){
		BasicDBObject  claimData = new BasicDBObject();
		//claimData.put("_id",1);
		claimData.put("claimId", 1);
		claimData.put("claimNo","sasi1234");
		claimData.put("vechicleNo","VX123");
		claimData.put("policyNo","POL123");
		claimData.put("engineNo","Test");
		claimData.put("isclaimActive",true);
		claimData.put("DOL","12/12/2014");
		claimData.put("policyStartdate",new Date());
		claimData.put("policyEndDate",new Date());
		
		BasicDBObject claimDet = new BasicDBObject();
		claimDet.put("claimId",1);
		claimDet.put("vechicleNo","ddd");
		claimDet.put("DOL","12/12/2015");
		claimData.put("claimDet", claimDet);
		
		return claimData;
	}
	public static List<BasicDBObject> getListOfBasicDataObjVal(){
		List<BasicDBObject> listOfData=new ArrayList<BasicDBObject>();
		
		BasicDBObject  claimData = new BasicDBObject();
		//claimData.put("_id",1);
		claimData.put("claimId", 1);
		claimData.put("claimNo","sasi1234");
		claimData.put("vechicleNo","VX123");
		claimData.put("policyNo","POL123");
		claimData.put("engineNo","Test");
		claimData.put("isclaimActive",true);
		claimData.put("DOL","12/12/2014");
		claimData.put("policyStartdate",new Date());
		claimData.put("policyEndDate",new Date());
		
		BasicDBObject claimDet = new BasicDBObject();
		claimDet.put("claimId",1);
		claimDet.put("vechicleNo","ddd");
		claimDet.put("DOL","12/12/2015");
		claimData.put("claimDet", claimDet);
		
		BasicDBObject  claimData1 = new BasicDBObject();
		//claimData.put("_id",1);
		claimData1.put("claimId", 1);
		claimData1.put("claimNo","sasi1234");
		claimData1.put("vechicleNo","VX123");
		claimData1.put("policyNo","POL123");
		claimData1.put("engineNo","Test");
		claimData.put("isclaimActive",true);
		claimData1.put("DOL","12/12/2014");
		claimData1.put("policyStartdate",new Date());
		claimData1.put("policyEndDate",new Date());
		
		BasicDBObject claimDet1 = new BasicDBObject();
		claimDet1.put("claimId",1);
		claimDet1.put("vechicleNo","ddd");
		claimDet1.put("DOL","12/12/2015");
		claimData1.put("claimDet", claimDet);
		
		listOfData.add(claimData1);
		listOfData.add(claimData);
		
		return listOfData;
	}
	
	
}
