package learnjava;

public class User {
	// Category- blueprint- class- prototype, template
			//instance object
	// Human- Class- properties:eye, ear, leg, nose, address, name
	//Laptop: price, module, size, color, Price
	String name;
	int age;
	Double salary;
	String telephone;
	String city;
	boolean isActive;
	
	
	public static void main(String[] args) {
		
        User u1 = new User();
        u1.name= "sudheer";
        u1.age=30;
        System.out.println(u1.name);
        System.out.println(u1.age);
        
        User u2 = new User();
        u2.age=27;
        System.out.println(u2.name);
        System.out.println(u2.age);
        
        User u3 = new User();
        
        u3.age=25;
        u3.name= "richa";
        u3.salary = 45.68;
        u3.isActive= true;
        u3.telephone= "7065903795";
     System.out.println(u3.age);   
     System.out.println(u3.name);
     System.out.println(u3.isActive);
     System.out.println(u3.salary);
     System.out.println(u3.telephone);
     System.out.println(u3.city);
     
     
      // No refeerence Object
     new User().name ="tom";
     new User().age = 34;
     // Null reference object
     User u4 = new User();
     u4 = null;
     //u4.name = "ashok";
     
	}

}
