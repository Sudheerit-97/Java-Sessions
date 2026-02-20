package opp_Abstraction;

public  abstract class Page {
	
	public Page() {
		this(20);
		System.out.println(" page__constructor");
	}
	public Page (int i) {
		System.out.println("page : "+i);
	}
	// we can't create the object of abstract class
	// we can have obstract and non abstract method 
	// we can't create the default method in abstract class
	// abstract class have non absract method as well 
	
	// No abstraction ----0% abstraction 
	// Only abstration--- we can create 100% abstraction 
	// we can create the constructor in abstract class ___ (imp)
	public abstract  void tittle ();
	
	public abstract void url ();
	
	public void pageLodingTime() {
		System.out.println("page loding ______timeout");
	}
	
	public static void displayLogo() {
		System.out.println("Display ___logo ");
	}
	public final void Footers() {
		System.out.println("display the page footers");
	}

}
