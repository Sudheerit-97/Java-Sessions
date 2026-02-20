package learnjava;

public class CarF {
     // Final and static 
	String name;
	String color;
	double price;
	String licensenumber;
	static final int wheel= 4;
	public static void main(String[] args) {
		
		 CarF c1 = new CarF();
		 c1.name = "bmw";
		 c1.color = "black";
		 c1.price= 45.67;
		 c1.licensenumber= "363";
		 //c1.wheel =4;
		 
		 
		 CarF c2 = new CarF();
		 c2.name = "audi";
		 c2.color = "blue";
		 c2.price= 99.78;
		 c2.licensenumber= "3635";
		 //c2.wheel =4;
		 
		 CarF c3 = new CarF();
		 c3.name = "maruti";
		 c3.color = "red";
		 c3.price= 108.76;
		 c3.licensenumber= "36835";
		 //c3.wheel =4;
		
		 // static variable will printed with class name 
	   System.out.println(c3.name+ " "+c3.color+" "+c3.price+" "+CarF.wheel);
	   System.out.println(CarF.wheel);

	}

}
