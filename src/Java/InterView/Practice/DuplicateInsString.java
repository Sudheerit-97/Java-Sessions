package Java.InterView.Practice;

public class DuplicateInsString {

	public static void main(String[] args) {
      String str= "programing"; 
        char ch[]=   str.toCharArray(); 
        int count =0;
        
        System.out.println("printing the duplicate character of"+str);
        for(int i=0; i<ch.length; i++) {
        	count=1;
        	for(int j=i+1;j<ch.length; j++ ) {
        		if(ch[i]==ch[j] && ch[i]!=0) {
        			count++;
        			 ch[j] = '0'; 
        		}
        	}
        }
        
        	
        }
        )
}

}
