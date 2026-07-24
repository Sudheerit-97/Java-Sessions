package interview.Java.Programs;

import java.util.Arrays;

public class SortCharcterInString {

	public static void main(String[] args) {
		// Sort characters in a string alphabetically.
		
		String str= "Automation"; 
		char st[] =	str.toLowerCase().toCharArray(); 
		
		Arrays.sort(st);
		
		String sortedSt= new String(st); 
		System.out.println(sortedSt);

	}

}
