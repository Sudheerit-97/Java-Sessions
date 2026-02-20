package super_keyword;

public class HomePage extends WebPage 
{
	int speed =50;
	 
	public HomePage () {
	     super(10);
		System.out.println("HomePage......default Constructor");
	}
	
	public HomePage(int i) {
		super(i+2);
		System.out.println("Homepage Value  :" +i);
	}
	
	
	@Override
	public void calculateTime() {
		super.calculateTime(); 
	System.out.println("HomePage...timeout  10");
     super.logo();
     super.speed=20;// we can change the value
     System.out.println(super.speed);// parent class speed. 
     System.out.println(speed);
     
     // super
     // super keyword is used for tha parent calss constructor and it should be 1st statement. 
     // with super keyword we can call the parent class  method  and variables 
     // super and this keyword can not be together
     
	}
	
}