package opp_inheritance;

public class Bmw extends Car {
	int maxspeed = 300;
	static int price =5000;
	 // method overriding: polymorphism (run time- dynamic binding)
	// when you have a method in parent class and same method in child class also
	// with same name , same type parameter and same sequence 
	// same return type 
	@Override
	public void start () {
		System.out.println("Start____ Bmw");
	}
		public void autoParking() {
			System.out.println("auto parking");
		}
//		 Static method can't be overriden
//		 method hiding
		public static void carDisplay() {
			System.out.println("bmw __display");
		}
	 
	 
	

}
