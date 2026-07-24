package practiceJava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {   	 // TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,4}; 
		
		Set<Integer> removeDup = new HashSet<Integer>(); 
		
		for(int a: arr) {
			removeDup.add(a); 
		}
 System.out.println(removeDup);
	}

}
