package encapsulation;

public class EMPTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("abhi", 50, 70, true);
		System.out.println(e1.getName()+"  "+ e1.getAge()+"  "+ e1.getSalary()+ "  "+ e1.isActive());
		
		e1.setName("tanya");
		e1.setAge(30);
		e1.setSalary(56);
		e1.setActive(true);
		e1.dob= "30-12-1992";
		System.out.println(e1.getName()+"  "+ e1.getAge()+"  "+ e1.getSalary()+ "  "+ e1.isActive());

		System.out.println("_____________________________");
	
	}

}
