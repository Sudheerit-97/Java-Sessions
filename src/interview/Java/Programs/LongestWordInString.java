package interview.Java.Programs;

public class LongestWordInString {

	public static void main(String[] args) {
		// Find the longest word in a string.
		
		String str= "I love Automation Testing"; 
		
		String[]  st = str.split(" ");
		
		String longest =""; 
		
		for(String word:st) {
			if(word.length()> longest.length()) {
				longest=word;
			}
		}
		
		System.out.println("Longest word = "+ longest);

	}

}
