package practiceJava;

import java.util.HashSet;
import java.util.Set;

public class ArrayHHH {

	public static void main(String[] args) {
		   int arr[]= {1, 2, 3, 2, 4, 5, 1}; 
		   
		   Set<Integer> duplaicate = new HashSet<>(); 
		   Set<Integer> findduplaicate = new HashSet<>(); 
		   
		   for (int e : arr) {
			   if(!duplaicate.add(e)) {
				   findduplaicate.add(e); 
			   }
			   
		   }
		   System.out.println(findduplaicate);   
		   
}

		   
	
		    
		    
//		   int num =150; 
//		   boolean status = false; 
//		   for(int a :arr ) {
//			   if (a==num) {
//				   System.out.println("Number found "+ num);
//				    status= true; 
//				    break; 
//			   }
//			  
//			  
//		   }
//		   
//		   if(!status) {
//				  System.out.println("element not found");
//			  }
//       
		   
		   
	}


