package interview.Java.Programs;

public class RegistrationPage {

	String name;
	String tel;
	String pwd;

	public void userReg(String name, String pwd, String tel) {
		System.out.println("enter userName" + name);
		System.out.println("enter pwd" + pwd);
		System.out.println("enter telephone" + tel);
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
	}

	public void getReg() {
		System.out.println(name + " ::" + tel + " :: " + pwd);
	}

	public static void main(String[] args) {
		RegistrationPage rs = new RegistrationPage();
		rs.userReg("sudheer", "76503795", "sudheer@123");
		rs.getReg();

	}

}
