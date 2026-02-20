package exceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		String browser = "ie";
		if (browser.equals("chrome")) {
			System.out.println("Launch the chrome");
		}
		else if(browser.equals("Safari")) {
        	  System.out.println("launch tha safari ");
          }
		else  if (browser.equals("mozilla")) {
        	  System.out.println("launch the mozilla");
          }
		else {
			System.out.println("please pass the right browser");
			throw new MyException("UNKNOWN BROWSER"); 
		}
		System.out.println("launch the URL ");
	}
// throws : pass the exception from one method to another method 
	// : m1()---m2();    try catch 
	// thhrow: Your own exception message 
	// we create an custom exception class -- class my exception extends RuntimeException
	// throw new myexception("mesg");
	// public myexception(String mesg){
	// super(mesg)    
	
}
