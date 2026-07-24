package practiceJava;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
   String str= "sudheer"; 
   
 char st[] =  str.toCharArray();
     Arrays.sort(st);
     System.out.println(Arrays.toString(st));
     String sortString= new String(st); 
     System.out.println(sortString);
	}

}
