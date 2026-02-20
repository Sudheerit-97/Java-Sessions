package stringManipulation;

public class StringLeteralsConstantPool {

	public static void main(String[] args) {
		
//		String Tr = "hello"; 
//		String tr= Tr.concat("selenium"); 
//		System.out.println(tr);
		
		String S1 = "hello"; // scp 
		String S2 = "hello"; //o 
		 String S3 = new String("world"); //1- Heap // 1 Scp 
		 String S4 = "world"; 
		 String S5 = "hello"; 
		 
		 String S6 = new String ("selenium"); // 1 - Heap ,, 1- scp for selenium 
		 String S7 = "selenium"; 
		 String S8 = new String("selenium"); //1. Heap
		 System.out.println(S1==S2);
		 System.out.println(S4==S3);// sCP== HEAP --- FALSE 
		 System.out.println(S6==S8);// == hEAP-- FALSE 
		 
		 System.out.println(S6.equals(S8));// true
		 System.out.println(S4.equals(S3));// true
		 
		 String obj = new String("testing"); //1heap -- 1-scp =2
		 String ob = new String ("testing"); // 1heap 
		 System.out.println(obj==ob);// fals 
		 
		 System.out.println(obj.equals(ob));// True 
		 
		 String o = "Testing"; 
		 String p = "testing";
		 String q = "testing"; 
		 System.out.println(obj==o);
		 System.out.println(obj==ob);
		 System.out.println(o==p);
		 System.out.println(p==q);
		 System.out.println(obj.equals(q));
		 System.out.println(obj.equals(o));
		 System.out.println(obj.equalsIgnoreCase(o));// it will be true because its caps will be ignored

	}

}
