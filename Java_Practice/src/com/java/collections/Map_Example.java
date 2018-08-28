package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<String,String>();
		Map<String, String> map = new LinkedHashMap<String,String>();
		map.put("1", "sudhir");
		map.put("2", "praveen");
		map.put("3", "Rajeev");
		map.put("5", "rahul");
		map.put("4", "prashant");
		
		System.out.println("\n******* Frist Approach ********\n");
		for(String key : map.keySet()){
			System.out.println("Key: "+key+" Value: "+map.get(key));
		}
		
		System.out.println("\n******* Second Approach ********\n");
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println("Key: "+entry.getKey()+ " Value: "+entry.getValue());
		}

		System.out.println("\n******* Third Approach ********\n");
		Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
	}
}
