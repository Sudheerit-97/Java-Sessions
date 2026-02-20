package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
          System.out.println("Hello");
          try {
        	  int i= 9/0;
          }
          catch(ArithmeticException  e) {
        	  e.printStackTrace();
        	 System.out.println("Some exception is coming ");
        	  
          }
          finally {
        	  System.out.println("I am in finally Block");
          }// when to use finally block;
          // (understanding) Make the connection with db sql:username/pwd
          //hit the sql : select*from employee; 
          // get the result from db table 
          
          // with the try catch block()
          // use the result in script // then the user will be connected 
          // Finally{}
          // will be closed the DB Connection 
          // use the result in script
          
          // Continue code 
          // logout // File system 
          
          
	}

}
