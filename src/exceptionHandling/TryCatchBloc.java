package exceptionHandling;

public class TryCatchBloc {
	
	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		   
//		try {
//			Thread.sleep(5000); //CE ---Checked Exception 
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		   try {
			TryCatchBloc obj = new TryCatchBloc();
			obj= null; 
			obj.name = "Sudheer";
	
					
			
		int i= 9/0;
		} catch(ArithmeticException e) {
			System.out.println("AE is Coming........");
			e.printStackTrace();
		}
		 // wew can also write the exception 
		catch(NullPointerException name){
			System.out.println("NullPointerException is showing");
			name.printStackTrace();
		}
		
		 System.out.println("bye!");

	}

}
