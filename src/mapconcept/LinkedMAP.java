package mapconcept;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMAP {
// It creates the data in sequence order 
	public static void main(String[] args) {
		
		
		 LinkedHashMap<String, String> empData=  new LinkedHashMap<String, String>(); 
	        empData.put("sudheer", "sdet1");
	        empData.put("anshika", "sdet2");
	        empData.put("hritik", "sdet3");
	        empData.put("tanya", "sdet4");
	        empData.put(null, "sdet5");
	        System.out.println(empData.size());
	       // System.out.println(empData.get(empData));
	        System.out.println(empData.get("anshika")); 
	        System.out.println(empData.get("test"));
	        
	        
	        System.out.println(empData);
	        
	        System.out.println("____________________");
	        
	        for (Map.Entry<String, String> entry : empData.entrySet()) {
	        	System.out.println(entry.getKey() + ":" + entry.getValue());
	        }

	}

}
