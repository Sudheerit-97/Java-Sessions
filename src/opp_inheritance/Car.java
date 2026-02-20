package opp_inheritance;

public class Car extends vehicle{
	// if the final class is there then that class would not be a parent
	// final method can't be overriden _ but can be ing=herited
	// final variable: constant 
	
	int maxspeed = 100;
	static int price =1000;
	
	public void start () {
		System.out.println("start the car");
	}
 public void refuel () {
	 System.out.println("refuel the car");
   }
    public void stop() {
    	System.out.println("stop the car");
    }
    // static method can't be overriden 
    public static void carDisplay() {
    	System.out.println("car____display");
    }
    
    // Private method can't be overriden
    private  void carshow() {
    	System.out.println("car____show the image");
    }
}
