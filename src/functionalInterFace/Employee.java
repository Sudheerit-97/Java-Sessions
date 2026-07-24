package functionalInterFace;

public class Employee {

	public static void main(String[] args) {
		Func fc = (String name) ->{
				System.out.println("name"+name);
				
			
		};
		Func fc1 = (String name) ->System.out.println("name"+name);	
		
		Func fc2 = (String name) ->System.out.println("name"+name.toLowerCase());
			
			
fc1.employee("facbook");
fc2.employee("LOUDA");
		
		
	}

}
