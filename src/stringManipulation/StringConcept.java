package stringManipulation;

public class StringConcept {

	public static void main(String[] args) {
           String str = "hello This is my java code and i  am happy i";
           System.out.println(str.length());
           
           System.out.println(str.charAt(5));
          
            System.out.println(str.charAt(32));
            System.out.println(str.indexOf("m"));
            System.out.println(str.indexOf("i"));
            
            System.out.println(str.indexOf("i", 3));
            System.out.println(str.indexOf("i", str.indexOf("i")+1));
            System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));
            
            System.out.println(str.indexOf("i",str.indexOf("i", str.indexOf("i")+1)+1));
            System.out.println(str.indexOf("i", str.indexOf("i",str.indexOf("i", str.indexOf("i")+1)+1)+1));
            
           String mesg = "This is my java code"; 
           System.out.println(mesg.indexOf("java"));
           System.out.println(mesg.indexOf("python" ));// it will give the minus value if its not avilable
           
          String m = "admin"; 
          if (m.indexOf("admin")==0) {
        	  System.out.println("Correct");
          }else {
        	  System.out.println("incorrect");
          }
          if (m.indexOf("admin")==-1) {
        	  System.out.println("case fail");
          }
          // 
          String test = "     Hello World    ";
        		 System.out.println(test.trim());
        		 
        		 String dob = "30-12-1992"; 
        		 System.out.println(dob.replace("-", "/"));
        		 String Mes = "     Hello world       "; 
        		 System.out.println(Mes.replaceAll(" ",""));
        		 
        		 String mg = "java Python ruby"; 
        		// System.out.println(mg.replaceAll(" ", "||"));
        		 System.out.println(mg.replaceAll("java", "JS"));
        		 
        		 //Split 
        		String pop = "java;Python;ruby;R";
        		String p[] = pop.split(";");
        		
        		System.out.println(p[3]);
        		System.out.println(p.length);
        		
        		String rest= "xXHelloseleniumxxXPythonXxXAutomationXxXLabs"; 
        		System.out.println(rest.replaceAll("xX", ""));
        		String R[]= rest.split("xX");
        		System.out.println(R[0]);
        		System.out.println(R[1]);
        		System.out.println(R.length);
        		
        		String te = " Test Automation LAabs";
        		String te1 = te.toUpperCase();
        		System.out.println(te1);
        		System.out.println(te1.toLowerCase());
        		String domain = "  hello selenium  "; 
        		System.out.println(domain.replaceAll("\\s+", ""));
        		
        		String t1= "my order id is:123456"; 
        		String OrderId= t1.replaceAll("\\D+", "order id is:");
        		System.out.println(OrderId);
        		 String t2= " your id is 9090 and order id is 12345"; 
        		 String OR= t2.replaceAll("\\D+", "");
        		 System.out.println(OR);
        		 
        		 String Spe = "Hello!! this is my value: 123456;";
        		 String NSP = Spe.replaceAll("[^a-zA-Z0-9]","");
        		 System.out.println(NSP);
        		
	}
}
