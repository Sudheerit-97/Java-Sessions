package interview.Java.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEmptyString {

	public static void main(String[] args) {
    ArrayList<String> StList= new  ArrayList<String>(Arrays.asList("java","","selenium","")); 
    
    ArrayList<String> rvList= new ArrayList<String>(); 
    
    for(String st: StList) {
    	if(!st.isEmpty()) {
    		rvList.add(st);
    	}
    }
    System.out.println(rvList);
	}

}
