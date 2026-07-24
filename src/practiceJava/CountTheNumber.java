package practiceJava;

public class CountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44, 20, 5,7,8,9,9,9,6,6}; 
	    
		   int num =9; 
		   boolean status = false; 
		   int count= 0; 
		   
		   for(int e : arr) {
			   if (e==9) {
				   count++; 
				  
			   }
		   }
			   
System.out.println(count);
	}

}
