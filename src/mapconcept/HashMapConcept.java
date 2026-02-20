package mapconcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
        HashMap<String, Integer> empMap=  new HashMap<String, Integer>(); 
        
        empMap.put("tom", 101);
        empMap.put("rahul", 95);
        System.out.println(empMap.size());
        System.out.println(empMap.get("tom"));
        System.out.println(empMap.get("rahul"));
        empMap.put("sudheer",23);
        System.out.println(empMap.get("sudheer"));
        
        HashMap<String, String> empData=  new HashMap<String, String>(); 
        empData.put("sudheer", "sdet1");
        empData.put("anshika", "sdet2");
        empData.put("hritik", "sdet3");
        empData.put("tanya", "sdet4");
        empData.put(null, "sdet5");
        System.out.println(empData.size());
        System.out.println(empData.get(empData));
        System.out.println(empData.get("anshika")); 
        System.out.println(empData.get("test"));
        
        
        System.out.println(empData);
        
        for (Map.Entry<String, String> entry : empData.entrySet()) {
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
	}

}
