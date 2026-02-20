package learnjava;

import java.util.Arrays;

public class ArrayLeterals {

	public static void main(String[] args) {
		int i[]= {1,10,15,20, 1};
		System.out.println(i.length);
		System.out.println(i[3]);
		System.out.println(i[i.length-1]);
		System.out.println("___________");
		System.out.println(Arrays.toString(i));
		for (int i1 =0; i1<= i.length-1; i1++) {
			System.out.println(i[i1]);
			
	      
		}
		 // Char 
		char ch[] = {'a','e','i','o','u'};
		System.out.println(Arrays.toString(ch));
		System.out.println(ch.length);
		for (char  e:ch) {
			System.out.println(e);
		}
		// String 
		String product[] = {"mac","android","windows","pc"};
		System.out.println(product[product.length-1]);
		System.out.println(Arrays.toString(product));
//		for (String e1:product) {
//			System.out.println(e1); 
//		}
		for(int b= 0;b<= product.length-1; b++) {
			System.out.println(product[b]);
		}
		
		// Object
		Object data[]= {10,"laptop", 25.55, 'm', true};
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		

	}

}
