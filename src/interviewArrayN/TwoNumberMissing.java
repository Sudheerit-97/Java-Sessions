package interviewArrayN;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumberMissing {

	public static void main(String[] args) {
		int arr[]= {1, 2 , 5,6}; 
		
		Set<Integer>numFind= new HashSet<Integer>(); 
		List<Integer>n= new ArrayList<Integer>(); 
		
		for(int num: arr) {
			n.add(num); 
		}
		
		int start=1; 
		int end=6; 
		for(int j=start; j<=end; j++) {
			if(!n.contains(j)) {
				System.out.println(j);
			}
					
		}
		

	}

}
