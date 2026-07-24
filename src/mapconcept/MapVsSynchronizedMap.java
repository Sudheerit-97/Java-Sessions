package mapconcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapVsSynchronizedMap {

	public static void main(String[] args) {
     Map<String, String>map1= new HashMap<String, String>(); 
     
     map1.put("1", "ravi"); 
     map1.put("2", "susheel"); 
     map1.put("3", "tanya"); 
     
     System.out.println(map1);
      for(Map.Entry<String, String> entry: map1.entrySet()) {
    	  System.out.println(entry.getKey()+"::  "+ entry.getValue());
    	  
    	
      }
      
      Map<String, String>synMap=  Collections.synchronizedMap(map1);
      System.out.println(synMap);
     
	}

}
