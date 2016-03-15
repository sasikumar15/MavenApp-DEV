package com.sasi.mongo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.util.JSON;

public class MongoProcess {

	
	/**
	 * Basic DB object 
	 */
	public static void saveOneDocuUsingBasicDBObj(){
		BasicDBObject claimData=StaticMongoValues.getBasicDataObjVal();
	    DBCollection collection=MongoConnection.getMongoDB().getCollection("claimTb");
	    collection.insert(claimData);
	    // Insert will always try to insert if _id already there then exception will thow 
	    // Save will check _id, if _id is there then update process will happen  
	}
	
	/**
	 *  Basic DB object 
	 */
	public static void saveManyDocuUsingBasicDBObj(){
		List<BasicDBObject> listOfData=StaticMongoValues.getListOfBasicDataObjVal();
		DBCollection collection=MongoConnection.getMongoDB().getCollection("claimTb");
	    collection.insert(listOfData);
	}
	
	/**
	 * @param jsonValues
	 * Save single or many doucmnets 
	 */
	public static void saveJsonDocuUsingBasicDBObj(String jsonValues){
		DBCollection collection=MongoConnection.getMongoDB().getCollection("claimTb");
		List<BasicDBObject>  values=(List<BasicDBObject>)  JSON.parse(jsonValues);
		collection.insert(values);
	}
	
	/**
	 * 
	 */
	public static void retriveAllDocusUsingBasicDbObj(){
		DBCollection collection=MongoConnection.getMongoDB().getCollection("claimTb");
		DBCursor curso=collection.find();
		while (curso.hasNext()) {
			System.out.println(curso.next().toMap());
		}
	}
	
	/*
	 * db.getCollection('claimTb').find(
                   							{},
						                    {
						                       "claimId" : 1,
						                       "claimNo"  :1 ,
						                       "_id"      :0   
						                    } 
                						)
	 */
	public static void retriveSpeficFieldValUusingBDO(){
		DBCollection collection=MongoConnection.getMongoDB().getCollection("claimTb");
		BasicDBObject dbQuery=new BasicDBObject();
		BasicDBObject dbFiels=new BasicDBObject();
		dbFiels.put("claimId", 1);
		dbFiels.put("claimNo", 1);
		dbFiels.put("_id", 0);
		DBCursor cursor= collection.find(dbQuery,dbFiels);
		while (cursor.hasNext()) {
			System.out.println(cursor.next().toMap());
		}
	}
	
	/*
	 * 
	 * db.getCollection('employee').find(
                                  {
                                     "empState" : "TamilNadu",   
                                     "empFamily.0.familyCount" : 4,
                                     "empFamily.0.aboutFamily.0.father":"Former"
                                   } ,
                                  {"empId":1})
	 * 
	 * 
	 */
	public static void findSpeficValUsingBDO(){
		DBCollection collection=MongoConnection.getMongoDB().getCollection("employee");
		BasicDBObject query =new BasicDBObject();
		BasicDBObject fields =new BasicDBObject();
		fields.put("empId", 1);
		
		query.put("empState", "TamilNadu");
		query.put("empFamily.0.familyCount", 4);
		
		DBCursor cursor= collection.find(query,fields);
		while (cursor.hasNext()) {
			System.out.println(cursor.next().toMap());
		}
		
	}
	/*
	 * 
	 * db.getCollection('employee').find(
        {
        "empState" : "TamilNadu",
         $or       :  [
                            {
                                "empSalPerAnnum" : {
                                                   $lt : 800000
                                                 } 
                             }, 
                             {
                             "empSalPerAnnum" : {
                                                   $lt : 600000
                                                 } 
                             }                   
                      ]
         
         },
            {"empId":1}

              )
	 * 
	 *   { "$or" : 
	 *            [ 
	 *              { 
	 *                "empSalPerAnnum" : { "$lt" : 760000 , "$gt" : 50000}
	 *               } , 
	 *                { "empFamily.0.familyCount.0" : 4}]
	 *     }

	 * 
	 *     $AND , $in same like $or
	 *     $ne "number", new BDO("$ne",4)   
	 * */
	public static List<Map> findLogicSpeficValUsingBOD(){
		DBCollection collection=MongoConnection.getMongoDB().getCollection("employee");
		
		List<BasicDBObject> OrQuery  =new ArrayList<BasicDBObject>();
		
		BasicDBObject orCon1 =new BasicDBObject();
		BasicDBObject orCon2 =new BasicDBObject();
		
		orCon1.put("empSalPerAnnum", new BasicDBObject("$lt",760000).append("$gt", 50000));
		orCon2.put("empFamily.0.familyCount.0", 4);
		
		
		OrQuery.add(orCon1);
		OrQuery.add(orCon2);
		
		BasicDBObject query =new BasicDBObject("$or", OrQuery);
		DBCursor cursor= collection.find(query);
		System.out.println(collection.find(query).getQuery());
		return printDocusUsingBOD(cursor);
	}
	public static List<Map> printDocusUsingBOD(DBCursor cursor){
		List<Map> listOfVlaue=new ArrayList<Map>(); 
		while (cursor.hasNext()) {
			listOfVlaue.add(cursor.next().toMap());
		}
		return listOfVlaue;
	}
	
	//{ "$set" : { "empSalPerAnnum" : 0 , "empFamily.0.familyCount" : 0}}
    public static void updateDocusUsingBOD(){
    	DBCollection collection=MongoConnection.getMongoDB().getCollection("employee");
    	
    	BasicDBObject whereQuery = new BasicDBObject();
    	whereQuery.put("empName", "sasikumar");
    	whereQuery.put("empId",1);
    	
    	System.out.println("coming");
    	BasicDBObject setCon=new BasicDBObject("$set", new BasicDBObject("empSalPerAnnum",0).
    			                                       append("empFamily.0.familyCount", 0));
    
    	System.out.println(setCon.toString());
    	
    	WriteResult result=collection.update(whereQuery,setCon);
    	System.out.println(result.wasAcknowledged());
    }
	
	
	/*public  static void insertTypes(){
		
		// Using Documnet example
		Document claimData=new Document();
		claimData.put("claimId", 1);
		claimData.put("claimNo","sasi123");
		claimData.put("vechicleNo","VX123");
		claimData.put("","");
		claimData.put("policyNo","POL123");
		claimData.put("engineNo","Test");
		claimData.put("isclaimActive",true);
		claimData.put("DOL","12/12/2014");
		claimData.put("policyStartdate",new Date());
		claimData.put("policyEndDate",new Date());
		
		Document claimDet = new Document();
		claimDet.put("claimId",1);
		claimDet.put("vechicleNo","ddd");
		claimDet.put("DOL","12/12/2015");
		claimData.put("claimDet", claimDet);
		
		MongoCollection<Document> collection=MongoConnection.getMongoDB().getCollection("claimTb");
		collection.insertOne(claimData);
		collection.insert
		
	}*/
	
/*	public static void insertJsonFormat(){
		ClaimBean climBean=BeanValues.getClaimBeanValue();
		String toString=ConstantsClass.getCONSTANTS_CLASS().getJsonConvertion().toJSon(climBean);
		MongoCollection<DBObject> collection=MongoConnection.getMongoDB().getCollection("claimTb");
	    Document dou=(Document) JSON.parse(toString);
		collection.insert 
		 
	
	}*/
	
	
	/*public static void retriveAllDocu(){
		MongoCollection<Document> collection=MongoConnection.getMongoDB().getCollection("claimTb");
		FindIterable<Document> iter=collection.find();
		
		for(Document douc:iter){
			System.out.println(douc.getInteger("claimId"));
			System.out.println(douc.getString("vechicleNo"));
			System.out.println(douc.getString("DOL"));
		}
	}*/
	
	               
	                             
	            
	}                       
	                             
	
