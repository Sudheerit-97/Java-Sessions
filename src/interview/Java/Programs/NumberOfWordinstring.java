package interview.Java.Programs;

public class NumberOfWordinstring {

	public static void main(String[] args) {
		// Count the number of words in a sentence
		String str = "I love my java coading"; 
		
		String[]  word= str.split(" ");
		int c= 0; // its for 2nd use
		int count = word.length; 
		System.out.println("count of each word is::"+count); 
		
		// 2nd way 
		for(String w:word) {
			c++; 
		}
		System.out.println(c);

	}

}
