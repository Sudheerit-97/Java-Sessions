package learnjava;

public class StringConcetanation {

	public static void main(String[] args) {
    // string class in java // non primitive 
		String s = "hello world";
		System.out.println(s);
		String S1 = "100";
		String S2 = "a";
		 String x= "hello";
		 String y = "selenium";
		 
		 int a = 100;
		 int b = 200;
		 
		 System.out.println(a+b);
		 System.out.println(x+y);// hello selenium 
		 System.out.println(x+y+a+b);// helloselenium100200
		 System.out.println(a+b+x+y);// 300helloselenium
		 System.out.println(x+y+a+b);// helloselenium100200
		 System.out.println(a+b+x+y+a+b);//300helloselenium100200
		 System.out.println(S1+S2);
		  double d1= 12.33;
		  double d2= 34.44;
		  System.out.println(x+y+d1+d2);//helloselenium12.3334.44
		  System.out.println(x+y+ (d1+d2));//helloselenium46.769999999999996
		  System.out.println(a+b+d1+d2+x+y+a+b);//346.77helloselenium100200
		char c= 'a';
		String t = "hello";
		System.out.println(c+t);//ahello
		System.out.println('a'+'b'+t);// 195hello(asii value will be added
		System.out.println('a'+'b'+100+ t);
		
		int p = 50;
		int q= 60;
		System.out.println("print the value of p:"+p);
		System.out.println("print the value of p:"+q);
		System.out.println("print the value of p and q:" +p+q);// print the value of p and q:5060
        // the number will be working like concetanate 
		System.out.println("add the value of p and q:" +(p+q));
		System.out.println('a'+'0'+'A');
		System.out.println('a'+'A');
				  
		 
		 
		 
		
		
	}

}
