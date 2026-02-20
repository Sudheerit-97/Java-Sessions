package opp_interface;

public interface Us_medical extends Who {
	
	// interface method's variables are static and final 
	// no method body is allowed
	// only method declaration 
	// only method prototype 
	// can not create the object of the interface 
	// interface can't have the business logic 
	// interface is 100% abstraction 
	// parent interface can be extends 
	// Interface can not have any parent class 
	
	int min_fee = 20; 
	
	public void CardiologyServcices();
	
	public void NeurologyServices();
	
	public void OrthopedicsServices(); 
   
	// after Jdk 8 the method body is allowed for the stattic method 
	
	 public static void Billing() {
		 System.out.println("usMedical _______billing");
	 }
}
