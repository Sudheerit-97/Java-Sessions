package opp_inheritance;

public class testCar {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.start();
		b.refuel();
		b.stop();
		b.autoParking();
		Car.carDisplay();
		Bmw.carDisplay();
		 System.out.println(b.maxspeed);
		 System.out.println(Bmw.price);
		 System.out.println(Car.price);
		 
		 
		System.out.println("__________________");
		Car c = new Car();
		c.start();
		c.refuel();
		c.engine();
		c.billing();
		System.out.println(Car.price);
		
    System.out.println("___________");
     Audi a = new Audi();
     b.engine();
     a.start();
     a.refuel();
     a.theftSafety();
     a.start();
     
     System.out.println("________");
     truck t = new truck();
     t.billing();
     t.engine();
     t.loading();
     System.out.println("___________");
		Honda h = new Honda ();
		h.start();
		h.refuel();
		h.fueleficiency();
		h.stop();
		
		System.out.println("  _______________");
		Car c1 = new Car();
		c1.start();
		c1.refuel();
		
		System.out.println("_________");
		// child class object can be reffered by parent reference 
		// individeul method won't be call  here 
	Car cr=	new Honda();
	cr.start();// overriden
	cr.stop();// inherited
	cr.refuel();// inherited
	
		
		
		

	}

}
