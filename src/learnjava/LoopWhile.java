package learnjava;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i=1;
         while (i<=30) {
        	 System.out.println(i);
        	 i++;
        	 
         }
         //
         while(true) {
        	 System.out.println("welcome to taj");
        	 break;
         }
         int p = 1;
         while (p<=100) {
        	 System.out.println(p);
        	 if(p%5==0) {
        		 System.out.println("hi");
        		 break;
        	 }
        		p++; 
        		 
         }
         //
         boolean sudh = true;
         while(!sudh) {
        	 System.out.println("hello");
        	 break;
         }
         //
         int t = 60;
         while(t>=50 && t<=100) {
        	 System.out.println("testing");
        	 t--;
        	 // use cases of while loop
        	 //when number of iteration are not fixed 
        	 //1. wait for web element on the page:5,10,15,3,30
        	 //2.waitfor page loading  :1,10,12,15,4
        	 //3.drop down:5, 10,15------>
        	 //web table pagination
        	 
         }
         // for loop
         System.out.println("-----------");
         
      for(int k =1; k<=10;) {
    	  System.out.println(k);
    	  k++;
      }
         //
//      for(;true ;) {
//    	  System.out.println("bye");
//    	  break;
//      }
//      // 
////      for(int k1=5; k1<=10; k1--) {
////    	  
////    	  System.out.println(k1);
////    	  
//    	  Fo
//      }
         
      for(byte k2=1; k2<=5; k2++) {
    	  System.out.println(k2);
      }
      // Flot
      for (float h=1.0f; h<=5.4; ) {
    	  System.out.println(h);
    	  h = h+0.2f;
      }
      System.out.println("---------------");
      for (char ch='A'; ch<='Z'; ch++) {
    	  System.out.println(ch+"="+(int)ch);
      }
      System.out.println("--------");
      for (char cg= 97; cg<=122; cg++) {
    	  System.out.println(cg+ "=" +(byte)cg);
      }
      // do while loop
      System.out.println("__________________");
      int h1= 1;
      do {
    	 System.out.println(h1);
    	  h1++;
    	 
      }
    	while(h1<=10);
     // Use case:// element	
      // odd even number with for loop
      for(int h2=2;h2<=20;h2++) {
    	  System.out.println(h2);
    	  h2++;
      }
      //
      System.out.println("_____________");
      int h3=2;
      while(h3<=10) {
    	  h3++;
    	  System.out.println(h3);//13
    	  h3++;
      }
	}

}
