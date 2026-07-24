package arrayListConcept;

import java.util.ArrayList;

public class ListConcept {

	public static void main(String[] args) {
        ArrayList<Object> concept= new ArrayList<Object>(); 
        concept.add("Sudheer"); 
        concept.add(700.66); 
        concept.add("mankapur"); 
        concept.add(33); 
        concept.add(true); 
        concept.add(null); 
        concept.add(null); 
        
        System.out.println(concept.size());
        System.out.println(concept);
        System.out.println(concept.get(2));
        
//        for(int i =0; i<concept.size(); i++) {
//        	System.out.println(concept.get(i));
//        }
        
       ArrayList<String> pageList = new ArrayList<String>(); 
       pageList.add("google"); 
       pageList.add("firefox"); 
       pageList.add("register"); 
       pageList.add("login"); 
       
       System.out.println(pageList.size());
       System.out.println(pageList);
       pageList.add(0, "sudheer");
       pageList.set(0, "Abhay"); // replace or update 
       pageList.add(0, "sudheer");// shift the data 
       System.out.println(pageList);
        
	}

}
