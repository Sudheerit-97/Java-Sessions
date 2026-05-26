package interview.Java.Programs;

public class OccurenceOfString {

	public static void main(String[] args) {
		String st = "This is my java code i am Super Happy i"; 
		int count = 0; 
		
	char str[]=	st.toCharArray(); 
	for(int i=0; i<=st.length()-1; i++) {
		if(str[i]=='i') {
			count++;
		}
	}
   System.out.println(" Occurences of i    ::: "+count);
	}

}
