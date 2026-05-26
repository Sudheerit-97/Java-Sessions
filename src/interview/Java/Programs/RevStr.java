package interview.Java.Programs;

public class RevStr {

	public static void main(String[] args) {
   String s = "sudheer"; 
   
   String rev = ""; 
   char n [] =   s.toCharArray(); 
   
   for(int i = s.length()-1;i>=0; i--){
	   rev = rev+s.charAt(i);
   }
   System.out.println(rev);
   
   
   
   // 2nd approach 
   
   String rev1 = new StringBuilder(s).reverse().toString();
   System.out.println(rev1);
	}

}
