package com.sasi.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
	
  private static MongoDatabase mongoDatabase=null; 
  private static DB db=null;
  // inner class 
  public static class MongoDbBean{
	  protected  static int portNo; 
	  protected static String hostName;
	  protected static String dbName; 
	  protected static boolean isRequiredNewConn;
  } 
  
@SuppressWarnings("resource")
public static synchronized MongoDatabase getMongoDataBase(){
	  if(mongoDatabase==null || MongoDbBean.isRequiredNewConn){
		  mongoDatabase=new MongoClient(MongoDbBean.hostName,MongoDbBean.portNo).getDatabase(MongoDbBean.dbName);
		  
	  }
	  return mongoDatabase;
  }
@SuppressWarnings({ "resource", "deprecation" })
  public static synchronized DB getMongoDB(){
	  if(db==null || MongoDbBean.isRequiredNewConn){
		  db=new MongoClient(MongoDbBean.hostName,MongoDbBean.portNo).getDB(MongoDbBean.dbName);
	  }
	  return db;
  }
}
