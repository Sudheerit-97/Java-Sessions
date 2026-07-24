package interview.Java.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeTheNeumericValue {

	public static void main(String[] args) {
    String st= "my mob number is :: 765903795"; 
    
   String s= st.replaceFirst("\\D+", "");
   System.out.println(s);
   
   String m= "first mob  is 9711 and second is 7065"; 
   
   Pattern pattern=  Pattern.compile("\\D+"); 
   Matcher matcher=   pattern.matcher(m);
       while (matcher.find()) {
    	   System.out.println(matcher.group());
       }
   
	}

}
