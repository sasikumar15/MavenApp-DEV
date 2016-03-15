package com.sasi.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvertion {

	/**
	 * @param obj
	 * @return
	 */
	public String toJSon(Object obj){
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json=gson.toJson(obj);
		return json;		
	}
	
}
