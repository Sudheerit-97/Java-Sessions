package learnjava;

public class Application {
	// Duplicate method are not allowed 
	// method overloading
	// when you have same method name with differenet parameter
	// parameter should difeerenet and type (different number and type)
	// 3. sequence of the parameter should be differnet
	// 4. return won't be able to effect on overloading  
     public void test() {
    	 }
     public void test(int i) {
    	 
     }
     public void test(int i, String j) {
    	 
     }
     public void test (String j, int i) {
    	 }
     // Ecom app(login)
     public void login() {
    	 }
     public void login(int pass) {
    	 }
     public void login (int otp,int pass) {
    	 }
     public void login (String id, int pass, int otp) {
    	  }
     // search 
     public void doSearch (String prodname) {
    	 }
     public void doSearch(String prodname, String color) {
    	 }
     public void doSearch(String prodname,String color,int price) {
    	 }
     // payment 
     public void payMethod(String paymentmethod) {
    	 switch (paymentmethod) {
		case "paytm":
			
			break;
case "paypal":
			
			break;

		default:
			break;
		}
     }
     public void payMethod (String CC, int cvv, int otp) {
    	 
     }
     
	public static void main(String[] args) {
		

	}

}
