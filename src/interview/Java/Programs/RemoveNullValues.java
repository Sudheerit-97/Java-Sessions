package interview.Java.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNullValues {

	public static void main(String[] args) {
		 ArrayList<String> StList= new  ArrayList<String>(Arrays.asList("java",null,"selenium",null)); 
		 
		 ArrayList<String> removeList= new ArrayList<String>();
		 
		 for(String st:StList) {
			 if(st!=null) {
				 removeList.add(st);
			 }
		 }
		 System.out.println(removeList);
	}

}
