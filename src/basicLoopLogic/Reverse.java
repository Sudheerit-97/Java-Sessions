package basicLoopLogic;

import java.util.HashMap;

public class Reverse {

	public static void main(String[] args) {
		
		//Count the occurrences of each character in a string using a Map
    String str= "radar"; 
    
    
    HashMap<Character,Integer> count= new  HashMap<Character,Integer>();
    
    for(char c: str.toCharArray()) {
    	if(count.containsKey(c)) {
    		count.put(c, count.get(c)+1);
    	}
    	else {
    		count.put(c, 1); 
    	}
    }
 System.out.println(count);
}
	
}