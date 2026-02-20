package learnjava;

public class Customer {
   String name;
   int age;
   String city;
	
	
	public static void main(String[] args) {
		 
		Customer c1 = new Customer();
		 c1.name= "vikas";
		 c1.age = 22;
		 c1.city= "kanpur";	
		 
		 Customer c2 = new Customer();
		 c2.name= "rushi";
		 c2.age = 25;
		 c2.city= "Mumbai";	
		 
		 Customer c3 = new Customer();
		 c3.name= "gunel";
		 c3.age = 27;
		 c3.city= "lucknow";
		 
		 Customer c4 = new Customer();
		 c4.name= "nitesh";
		 c4.age = 30;
		 c4.city= "noida";
		 
		 System.out.println(c1.name+" "+ c1.age+" "+c1.city);//v
		 System.out.println(c2.name+" "+ c2.age+" "+c2.city);// r
		 System.out.println(c3.name+" "+ c3.age+" "+c3.city);//g
		 System.out.println(c4.name+" "+ c4.age+" "+c4.city);//n
      c1=c2;
      
      System.out.println(c1.name+" "+ c1.age+" "+c1.city);//r
		 System.out.println(c2.name+" "+ c2.age+" "+c2.city);//r
		 System.out.println(c3.name+" "+ c3.age+" "+c3.city);//g
		 System.out.println(c4.name+" "+ c4.age+" "+c4.city);//n
		 
		 c2=c3;
		 System.out.println(c1.name+" "+ c1.age+" "+c1.city);
		 System.out.println(c2.name+" "+ c2.age+" "+c2.city);
		 System.out.println(c3.name+" "+ c3.age+" "+c3.city);
		 System.out.println(c4.name+" "+ c4.age+" "+c4.city);
		 
		 c3= c4;
		 
		 System.out.println(c1.name+" "+ c1.age+" "+c1.city);
		 System.out.println(c2.name+" "+ c2.age+" "+c2.city);
		 System.out.println(c3.name+" "+ c3.age+" "+c3.city);
		 System.out.println(c4.name+" "+ c4.age+" "+c4.city);
		 
		 c4 =c1;
		 
		 System.out.println(c1.name+" "+ c1.age+" "+c1.city);
		 System.out.println(c2.name+" "+ c2.age+" "+c2.city);
		 System.out.println(c3.name+" "+ c3.age+" "+c3.city);
		 System.out.println(c4.name+" "+ c4.age+" "+c4.city);
		 
		 
	}

}
