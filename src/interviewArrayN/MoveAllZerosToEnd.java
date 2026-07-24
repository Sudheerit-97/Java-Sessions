package interviewArrayN;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {1,0,3,0,5,0,7};

		int index = 0;

		for(int num : arr){
		    if(num != 0){
		        arr[index++] = num;
		    }
		}

		while(index < arr.length){
		    arr[index++] = 0;
		}
   System.out.println(Arrays.toString(arr));
	}

}
