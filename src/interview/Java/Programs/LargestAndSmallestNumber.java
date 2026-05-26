package interview.Java.Programs;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
  int numbers[]= {-10, 15, -100, 20, 300, 4000}; 
  int largest = numbers[0]; 
  int smallest= numbers[0]; 
  
  for(int i=1; i<numbers.length; i++) {
	  if(numbers[i]>largest) {
		  largest=numbers[i];
	  }
	  else if(numbers[i]<smallest) {
		  smallest=numbers[i];
	  }
  }
  System.out.println("Array Numbers::"+Arrays.toString(numbers));
  System.out.println("largest number::"+largest);
  System.out.println("smallest numebrs"+smallest);
	}

}
