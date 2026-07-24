package interviewArrayN;

import java.util.ArrayList;
import java.util.Arrays;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {
		int arr[]= {3,6,7,8,10,15};
		int even = 0;
		int odd = 0;
    ArrayList<Integer>evenlist= new  ArrayList<Integer>();
    ArrayList<Integer>oddlist= new  ArrayList<Integer>();
		for(int num : arr){
		    if(num % 2 == 0) {
		    	evenlist.add(num);
		    	even++;
		    }
		        
		    else {
		    	oddlist.add(num);
		    	odd++;
		    }
		        
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(evenlist+"  ::  "+ even);
		System.out.println(oddlist+"  :: "+odd);

	}

}
