package interviewArrayN;

import java.util.ArrayList;
import java.util.Arrays;

public class CountEven {

	public static void main(String[] args) {
   ArrayList<Integer> numlist= new   ArrayList<Integer>(Arrays.asList(45,10,2,14,18)); 
   int even =0; 
   int odd =0; 
   
   ArrayList<Integer> evenlist= new   ArrayList<Integer>(); 
   ArrayList<Integer> oddlist= new   ArrayList<Integer>(); 
   
   for(int num : numlist) {
	   if(num%2==0) {
		  // even++; 
		   evenlist.add(num); 
		  
	   }
	   else {
		   //odd++; 
		   oddlist.add(num);
	   }
   }
   
   
  System.out.println(evenlist);
  System.out.println(oddlist);
   
	}

}
