package learnjava;

import java.util.Arrays;


public class ArrayConcept {

	public static void main(String[] args) {
		// non primitive data type
		// can store similar kind of data
		//. 1. size is fixed : static array	
		//. it can store only similar kind of data: we can solve this problem through the object array
       int i[]= new int[4];
       i[0] =10;
       i[1]=20;i[2]=30; i[3]=40;
       
       System.out.println(i.length);// array length
       System.out.println(i[0]);
       System.out.println(i[1]);
       System.out.println(i[2]);
       System.out.println(i[3]);
       
       System.out.println(i);// address of the array - random string
       // print array with the method
       
       System.out.println(Arrays.toString(i));
       // print the array with for loop
       for(int j=0; j<=3;j++) {
    	   System.out.println(i[j]);
    	   if(i[j]==20) {
    		   System.out.println("Hi");
    		   break;
    	   }
    	   else 
    	   System.out.println("bye");
       }
    	 //
       System.out.println("_________________");
       
       short sh [] = new short[3];
    		   System.out.println("length=" +sh.length);
    		   System.out.println("LI="+0);
    		   
    		   sh[0] =5;
    		   sh[1]=10;
    		   sh[2]= 20;
    		   System.out.println(Arrays.toString(sh));
    		   for(short j1=0; j1<=sh.length-1; j1++) {
    			   System.out.println(sh[j1]);
    		   }
    		   // char array
    		   char ch[]= new char [4];
    		   System.out.println("length="+ch.length); 
    		   ch[0]= 'a';
    		   ch[1]= '1';
    		   ch[2]='$';
    		   ch[3]=98;
    		   System.out.println(Arrays.toString(ch)); 
    		   for(char k=0; k<= ch.length-1; k++) {
    			   System.out.println(ch[k]);
    		   }
    		   // float array
    		   float f[] = new float[3];
    		   System.out.println(f.length);
    		   f[0] =10.33f;
    		   f[1]= 100;
    		   f[2]=70.4f;
    		   System.out.println(Arrays.toString(f));
    		   
    		   System.out.println("______________");
    		   
    		   // object array -- many kinds of data type we can fill 
    		   //emp data, salary(int), name(string),age(int)gender( char) 
    		   
    		   Object empdata[]= new Object[5];
    		   empdata[0] = "sudheer";
    		   empdata[1]= 30;
    		   empdata[2]= 55.50;
    		   empdata[3]= 'f';
    		   empdata[4]= true;
    		   System.out.println(empdata.length);
    		   System.out.println(Arrays.toString(empdata));
    		   
    		   for (int i2= 0; i2<= empdata.length-1;i2++) {
    			   System.out.println(empdata[i2]);
    			   
    		   }
    		   System.out.println("________________");
    		   //
    		   String product[] = new String[4];
    		   product[0] = "macbook";
    		   product[1] = "lenovo";
    		   product[2] = "sony";
    		   product[3]= "sudheer";
    		   
    		   System.out.println(product.length);
    		   System.out.println(Arrays.toString(product));
    		   
    		   for (int j=0; j<=product.length-1; j++) {
    			   System.out.println(product[j]);
    		   }
    		   
    		   // reverse loop
    		   for (int j1= product.length-1;j1>=0; j1--) {
    			   System.out.println(product[j1]);
    		   }
	}

}
