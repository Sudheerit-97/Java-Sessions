package practiceJava;

public class CountWordsInstring {

	public static void main(String[] args) {
		
		String str = "hello how are you"; 
		int count = 0;
		
	String st[]=	str.split(" "); 
	
	  for(String s: st) {
		  count++;
	  }
		
   System.out.println("count of word"+str+ "  "+ count);
	}

}
