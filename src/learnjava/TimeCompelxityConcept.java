package learnjava;

public class TimeCompelxityConcept {

	public static void main(String[] args) {
			// larger data:1to 10m
		// Big O ->O// represents time complexity
		int i=10;
		System.out.println(i);
		//
	  for(int k=0;k<=10;k++) {
		  System.out.println(k);
		  
		  // 1+n+n+n -> 3n+1(linear equation) -> 3n -> O(n)
	  }
	  //
	  int p=0;
	  while(p<=10) {
		  System.out.println(p);
		  p++;
		  System.out.println("hi");
		  // 1+n+n+n+n = 4n+1 = O(n)
	  }
//
	  int p1=0;
	  do {
		  System.out.println(p1);
		  p1++;
	  }
	  while( p1<=10);
	  //
	  short sh[] = {100, 200, 500, 300,};
		 for (short e: sh) {
			 System.out.println(e);
			 // Time complexity: 1+n+n-> 2n+1->  2n-> O(n)
			 // Time complexity equaltion will be leanear for single for loop 
		 }
		 // nested for loop time complexity
		 
		 for(int x=1; x<=5; x++) {
			 for(int y=1; y<=5;y++) {
				 System.out.println(x+""+y);
				 // Time complaxity equation will be quadratric for nested for loop
				 // Time complexity on nested for loop
				 //(1+n+n)(1+n+n+n+n)=> (1+2n)(1+3n)=>(1+3n+2n+6n^2)=> 6n^2+5n +1=>
				 // (6n^2+5n)=> n (6n+5) => n(6n)=> 6n^2= O(n^2)
			 }
		 }
		 //
		 
	}

}
