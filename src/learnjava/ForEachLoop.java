package learnjava;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
	 int i[] = {10, 20, 30,5, 35, 25,1};
	 // index loop
	 System.out.println(Arrays.toString(i));
	 for (int k =0; k<= i.length-1; k++) {
		 System.out.println(i[k]);
	 }
	 // For each 
	 for (int e:i) {
		 System.out.println(e);
	 }
	 // Double for each array 
	 double d[]= {1.1,2.2, 3.4, 23.2, 10.5};
	 System.out.println(Arrays.toString(d));
	 for (double e:d) {
		 System.out.println(e);
	 }
// String for each loop
	 String product[] = {"mac","android","windows","pc"};
	 System.out.println(Arrays.toString(product));
	 for (String s : product) {
		 System.out.println(s);
		 break;
	 }
	 // For each with Object
	 Object data[] = {10, "mac",30.33,'m', true};
	 System.out.println(data.length);
	 System.out.println(Arrays.toString(data));
	 System.out.println(data[3]);
	 for (Object e:data) {
		 System.out.println(e);
	 }
	 //For each for indexing and reverse order
	 System.out.println("______________");
	 int num[]= {10, 20, 30, 40, 16};
	 
	 int count = 0;
	 for (int e:num) {
		 System.out.println(count+"_"+e);
		 count++;
	 }
	 // 
	 int num1[]= {10, 20, 30, 40, 16};
	 int count1= num1.length-1;
	 for(int e:num1) {
		 e=count1;
		 System.out.println(num[e]);
		 count1--;
	 }
	 // short (for each loop)
	 short sh[] = {100, 200, 500, 300,};
	 for (short e: sh) {
		 System.out.println(e);
	 }
	 // Char (For each loop)
//	 for (char ch='A'; ch<='Z';ch++) {
//		 System.out.println(ch+"_"+(int)ch);
//	 }
	 
	}

}
