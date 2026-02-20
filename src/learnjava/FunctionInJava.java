package learnjava;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionInJava {
// cannot create a function inside the function
	// functions are parrellel to each other
	// but can call a function to another function
// ist no input and not return 
	//input: no input// return: void-- can not return anything 
	public void test () {
		System.out.println("test method");
	}
	// some input and no return 
	public void getbill (int days ) {
		System.out.println("getting billing info");
		int finalBill = 100*days;
		
		System.out.println(finalBill);
		
	}
	
	
	// two input and return
	// return type: int
	public int sum (int a, int b) {
		System.out.println("add two numbers");
		int s = a+b;
		return s;
	}
	// no inpi= input and some return
	// return type :String
	public String getInfo () {
		System.out.println("getting information");
		String s = "hello app";
		 return s;
	}
	// return type: boolean
	public boolean isAppExixt() {
		return true;
	}
	public int caluclateMarks (int marks, int exmarks, int descpline ) {
		System.out.println("print the value");
		int fmark = marks+ exmarks+descpline;
		return fmark;
	}
	// void return and blank return
	public void testing () {
		System.out.println("test is done ");
		return ;
	}
	// launch URL
	public void launchURL (String url) {
		System.out.println(url);
	}
	// array 
	public String[] device () {
		System.out.println("getting devices");
		String devices[] = {"mac", "apple", "windows", "hp"};
		return devices;
		
	}
	//
	public ArrayList<String> userList() {
		System.out.println("getting all users");
		ArrayList<String>userList = new ArrayList<>();
		userList.add("ravi");
		userList.add("leema");
		userList.add("amar");
		return userList;
		
	}
	 
	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		
		obj.getbill(7);
		
		int m = obj.sum(10, 20);
		
		System.out.println(m);
		
		
		int m1= obj.sum(-10,7);
		System.out.println(m1+12);
		String mesg= obj.getInfo();
		System.out.println(mesg);
		
		//System.out.println(obj.isAppExixt());
		if(obj.isAppExixt()) {
			System.out.println("app login");
		}
		
		int calculation= obj.caluclateMarks(10, 5, 3);
		System.out.println(calculation);
		obj.testing();
		obj.launchURL("https://www.google.com");
		
		String s[]=obj.device();
		System.out.println(Arrays.toString(s));
		System.out.println(s.length );
		
		ArrayList<String> u =obj.userList();
		System.out.println(u);
		System.out.println(u.size());
		
     
	}

}
