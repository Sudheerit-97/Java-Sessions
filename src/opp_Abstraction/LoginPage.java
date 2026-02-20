package opp_Abstraction;

public class LoginPage extends Page {
	// Constructor
      public LoginPage() {
    	  
    	  System.out.println("loginPage____constructer");
      }
      public LoginPage(int i ) {
    	  System.out.println("login page cconstrutor value:" + i);
      }
      
	@Override
	public void tittle() {
		System.out.println("login Page ___tittle");
		
	}

	@Override
	public void url() {
		System.out.println("Lp ___Url ");
	}
	@Override
	public void pageLodingTime() {
		System.out.println(" Login page loding ______timeout");
	}
   public void doLogin (String un, String pw) {
	   System.out.println("login with : " + un + " " + pw);
   }
}
