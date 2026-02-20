package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
        String data = null;
        
        try {
        if (data== null) {
        	throw new Exception("data not found"); 
        }
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

}
