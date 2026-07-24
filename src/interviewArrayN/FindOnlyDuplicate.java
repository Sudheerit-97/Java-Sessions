package interviewArrayN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindOnlyDuplicate {

	public static void main(String[] args) {
		
	        // Sample list with duplicates (10 and 2 appear more than once)
	        ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(45, 10, 2, 14, 18, 10, 2, 2)); 
	        
	        HashSet<Integer> uniqueElements = new HashSet<>();
	        HashSet<Integer> duplicatesPrinted = new HashSet<>();
	        
	        System.out.println("Original List: " + numlist);
	        System.out.print("Duplicate Elements: ");
	        
	        for (int num : numlist) {
	            // If add() returns false, the item is a duplicate
	            if (!uniqueElements.add(num)) {
	                // Only print if we haven't reported this duplicate yet
	                if (duplicatesPrinted.add(num)) {
	                    System.out.print(num + " ");
	                }
	            }
	        }
	        System.out.println(); // New line
	        
	     // With array only 
	        
	    	int[] numbers = {45, 10, 2, 14, 18, 10, 2, 2}; 
	        
	        HashSet<Integer> uniqueElement = new HashSet<>();
	        HashSet<Integer> duplicatesPrinte = new HashSet<>();
	        
	        System.out.println("Original Array: " + Arrays.toString(numbers));
	        System.out.print("Duplicate Elements: ");
	        
	        for (int num : numbers) {
	            if (!uniqueElement.add(num)) {
	                if (duplicatesPrinte.add(num)) {
	                    System.out.print(num + " ");
	                }
	            }
	        }
	        System.out.println();
	    }
	}