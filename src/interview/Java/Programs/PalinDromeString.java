package interview.Java.Programs;

public class PalinDromeString {

	public static void main(String[] args) {
		
		String str=  "level"; 
	   String palindrome= ""; 
	   
	  
	   for (int i = str.length() - 1; i >= 0; i--) {
		   palindrome = palindrome + str.charAt(i);
		  
		   }
		
	   if(str.equals(palindrome)) {
		   System.out.println("String is palindrome::"+palindrome);
		   }
	   else {
		   System.out.println("its not palindrome");
	   }
	   // 2nd approach
	   
	   
	   
	      String rev = new StringBuilder(str).reverse().toString();

	        if (str.equals(rev)) {
	            System.out.println("Palindrome  :: "+palindrome);
	        } else {
	            System.out.println("Not Palindrome");
	        }
	}

}
