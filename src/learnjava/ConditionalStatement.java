package learnjava;

public class ConditionalStatement {

	public static void main(String[] args) {
     int x= 10;
     int y= 20;
     System.out.println(x<y);
     
     // < <= > >= !=
     if (x>y) 
     {
    	 System.out.println("pass");
     }
     else 
     {
    	 System.out.println("fail");
     }
     //
     if(true)
     {
    	 System.out.println("hi");
     }
//     else // dead code  
//     { 
//    	 System.out.println(" bye");
//    	 
//     }
     //
     boolean sud = true;
     if(sud)
     {
    	 System.out.println("hello");
     }
     else 
     {
    	 System.out.println("selenium");
     }
     //
     int t1 = 100;
     int t2 = 100;
     if(t1>=t2) {
    	 System.out.println("t1 and t2 is equal or  greater ");
     }
     else 
     {
    	 System.out.println(" t1 and t2 is not equal from t2");
     }
    	 // 
     int p1= 100;
     int p2 =200;
     if(p1!=p2)
     {
    	 System.out.println("selenium");
     }
     // 
//	 String browser = "firefox";
//	 if (browser.equals("chrome"))
//	 {
//		System.out.println("launch chrome"); 
//	 }
//	 if (browser.equals("firefox")) {
//		 System.out.println(" launch firefox");
//	 }
//	 if (browser.equals("edge")) {
//		System.out.println("launch edge"); 
//	 }
//	 if (browser.equals("safari")) {
//		 System.out.println("launch safari");
//	 }
//	 else {
//		 System.out.println("plz pass the right browser");
//	  }
	 
	 String browser = "opera";
	 if (browser.equals("chrome")) {
		 System.out.println("launch chrome");
	 } 
	 else if (browser.equals("firefox")) {
		 System.out.println("launch firefox");
	 }
	 else if (browser.equals("edge")) {
		 System.out.println("launch edge");
		 
	  }
	 else if (browser.equals("safari")) {
		 System.out.println("launch safari");
	 }
	 else {
		System.out.println("launch corect browser"); 
	 }
     }

}
