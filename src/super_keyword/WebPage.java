package super_keyword;

public class WebPage 
{
	
	int speed = 10; 
	
	public WebPage () {
		super();
		System.out.println("WebPage......default Constructor");
	}
	
	public WebPage(int i) {
		System.out.println("webPage Value  :" +i);
	}
	
	public void calculateTime() {
		
	System.out.println("WebPage...timeout  20");
	}

	public final void logo() {
		System.out.println("WebPage____ logo");
	}
	
}
