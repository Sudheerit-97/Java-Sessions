package interviewArrayN;

import java.util.Arrays;

public class FindLartgestNumber {

	public static void main(String[] args) {
     int[] arr= {5, 7, 3, 10, 15, 20}; 
     
     
     
     int max = arr[0]; 
     
     for(int i=1; i<arr.length; i++) {
    	 if(arr[i]>max) {
    		 max=arr[i];
    	 }
     }
     System.out.println("Original Array:: "+ Arrays.toString(arr));
     System.out.println("maxed number from array "+max);
	}

}
