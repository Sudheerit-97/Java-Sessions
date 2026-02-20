package learnjava;

public class MethodOverloading {
  public void saerch (int a) {
	  }
	public void saerch (int price, String name) {
		}
	public void search (int price, String name, String color) {
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.saerch(10, "ravi");
		

	}

}
