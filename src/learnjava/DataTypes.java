package learnjava;

public class DataTypes {

	public static void main(String[] args) {
// data types
		//primitive data types
		//no need create object
		//non primitive data types : string , Class, Arrays, Object
		
		// primitive data types
		// 1. bolean data data type (true / false) 
		//2. numeric type 
		//a inteager
		// b floating point: float double 
		// Character type : Char
		
		
		
		//1 Byte size  1 byte = 8bit
		// range -128 to 127 (2^7 to 2^7-1)
		byte b = 10;
		b= 20;
		System.out.println(b);
		// for small value we can take , age , months , weeks 
		
		// 2 short (Range 2 byte = 16 bit )
		// Range -32768 to 32767 (2^15 to 2^15-1)
		short s1 = 500;
		short s2 = 2;
		System.out.println(s1);
		System.out.println(s2);
		// 3inteager 
		// size 4 bytes = 32 bits 
		// range -2147483648 to 2147483647(- 2 ^31 to 2^31-1)
		// Bill , salary , price
		int i = 10;
		int i1 = 5000;
		
		
		// 4 long Range: 8 bytes = 64bits
		// (-2^63 to 2^63-1)
		// we won't take the phone no aashar, ssn  for this we will take string
		long l= 1919919l;
		long l1= 252552L;
		System.out.println(l1);
		System.out.println(l);
		//5 float decimal values size 4 bytes= 32 bits
		// we wll store point  values
		// range   .we can take upto 7 digits 
		
		float f1 = 45.66f;
		System.out.println(f1);
		float f2 = (float) 10.66;
		System.out.println(f2);
		
		// 6 double (size 8 bytes =64 bits )
		// after . we can take 15 digits
		double d1= 12.66622;
		System.out.println(d1);
		// 7. char type : only single digit value 
		// range: a-z and A-Z// 97 to 122
		// A-Z (65 to 90)	// 0to 9 = 48 to 57 
		// size 2 bytes 
		char c= 'a';
		char b1 = '1';// 0-9
		char b2= '$';
		char n1 = 'a';
		char n2 = 'b';
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1+n2);// it will print the ascii value
		System.out.println((byte)n2);
		System.out.println((byte)c);
		System.out.println((byte)'$');
		// 8 boolean: true / false
		// size : 1 bit
		// range : no range   
		
		

		
		
		
				
				
		
		
		
		
		
		
		
		
	}

}
