package gitparc;

public class HelloPrint {
	public String method(String name) {
		System.out.println("my name is sudheer"+name);
		return  name;
	}
	public static void main(String[] args) {
 System.out.println("This is git print"); 
 
 HelloPrint h = new HelloPrint();  
 String r =  h.method("sudheer"); 
 System.out.println(r);
   
	}
	

}
