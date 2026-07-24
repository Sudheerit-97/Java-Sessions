package interview.Java.Programs;

public class OnlyConsoNant {

	public static void main(String[] args) {
      String st= "automation"; 
      int consonant= 0;
      
      for(int i=0; i<st.length();i++) {
    	 char ch= st.charAt(i);
    	 if (ch >= 'a' && ch <= 'z') {
    	 if(ch!='a' ||ch!='e'|| ch!='i'||ch!='i'||ch!='i'|| ch!='o'||ch!='u') {
    		 System.out.print(ch + " ");
    	 }
    	 }
      }
    
	}

}
