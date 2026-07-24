package interviewArrayN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateEle {

	public static void main(String[] args) {
  ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(2,4,3,36,7,7,17,17));
  
  Set<Integer> UniqueEle= new  HashSet<Integer>(); 
  
  Set<Integer> duplicateEle= new  HashSet<Integer>(); 
  
  System.out.println("original numList"+numList);
  System.out.println("Duplicate elements:");
  for(int num:numList ) {
	  if(!UniqueEle.add(num)) {
		  if(duplicateEle.add(num)) {
			  System.out.println(num+ "");
		  }
	  }
	
  }
  System.out.println();
  
	}

}
