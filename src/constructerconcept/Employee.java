package constructerconcept;

public class Employee {
	int age;
	String name;
	double salary;
	boolean isActive;
	char gender;
	
	

	public Employee(int age, String name, double salary) {
		
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int age, String name, double salary, char gender) {
		
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public Employee(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(30,"tanya");
		System.out.println(e1.age+" "+ e1.name);
		
		Employee e2 = new Employee(30,"manoj",70.44, 'm');
		System.out.println(e1.age+ " "+ e1.name +" "+ 10.55+ " " + 'm'+" "+e1.isActive);
	}

}
