package interview.Java.Programs;

public class Login {
	
	String userName; 
	String password; 
	

	public Login(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	public void getUserLogin( ) {
		if(isValidUser(userName)) {
			System.out.println("enter the username"+userName);
			System.out.println("enter the password"+ password);
			System.out.println(" click the login button ");
			
		}
		
	}
	
	private boolean isValidUser(String userName)
	{
	 System.out.println("checking the user name is valid!"+userName);
	 if(userName.length()>=3) {
		 System.out.println("user is valid");
		 return true; 
	 }
	 else {
		 System.out.println("user is not valid");
		 return false; 
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lp = new Login("Su", "Sudheer@123"); 
		lp.getUserLogin();
	}

}
