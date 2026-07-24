package interview.Java.Programs;

import java.util.Arrays;

public class StringAnagram {

	 public static boolean stringAnagram(String s1, String s2) {
	        String str = s1.replaceAll("\\s", "");
	        String str1 = s2.replaceAll("\\s", "");

	        if (str.length() != str1.length()) {
	            return false;
	        } else {
	            char c1[] = str.toLowerCase().toCharArray();
	            char c2[] = str1.toLowerCase().toCharArray();
	            Arrays.sort(c1);
	            Arrays.sort(c2);
	            System.out.println("original String is "+s1+"  and  "+ s2);
	            return Arrays.equals(c1, c2);
	        }
	    }

	    public static void main(String[] args) {
	        //System.out.println(stringAnagram("   SiLENT", "     Listen   "));
	        //System.out.println(stringAnagram("Lives", "Elvis"));
	    	
	       
	    }
	}