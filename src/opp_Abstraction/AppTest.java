package opp_Abstraction;

public class AppTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage ();  
		lp.tittle();
		lp.url();
		lp.pageLodingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();
		lp.Footers();
		
	    System.out.println("____________");
	    // top casting
	    // Child class object can be referred by parent abs class of variable 
//	    Page pg = new LoginPage (); 
//	     pg.tittle();
//	     pg.url();
//	     pg.pageLodingTime();
//	     pg.Footers(); 
		
	}

}
