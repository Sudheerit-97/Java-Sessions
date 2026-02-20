package exceptionHandling;
// try - finally- yes
// try --catch --yes
// try -- catch -- finally -----yes
// catch -- finally ----no 
// try -- try - finally --No (these are the combinaton)
public class FinallyBlockQuestion {
    public static int getmarks (String studentname) {
    	System.out.println("getting marks for:"+studentname);
    	if(studentname.equalsIgnoreCase("rahul")){
    		
    		try {
    		int i = 9/3;
    		return 89;// if the exception persist then this return won't be processed
    		}
    		catch(ArithmeticException e) {
    			e.printStackTrace();
    			System.out.println("got some exception");
    			return 60;
    		}
    		finally {
    			System.out.println("finally block");
    			return 90;
    		}
    		
    		
    	}
    	else if(studentname.equalsIgnoreCase("om")){
    		return 60;
    		
    	}
    	else if(studentname.equalsIgnoreCase("rashi")){
    		return 70;
    		}
    	else if(studentname.equalsIgnoreCase("tanya")){
    		return 25;
    		}
    	else {
    		return -1;
    	}
    }
	public static void main(String[] args) {
		int m = getmarks("om ");
		System.out.println(m);
       
	}

}
