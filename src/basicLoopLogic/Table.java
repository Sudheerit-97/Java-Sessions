package basicLoopLogic;

public class Table {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
		    for(int j = 1; j <= 5; j++) {
		        System.out.print(i * j +"\t");
		    }
		    System.out.println();
		}
		
		// Print a square pattern of stars
		int n = 5;
		for(int i = 1; i <= n; i++) {
		    for(int j = 1; j <= n; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
		System.out.println("________________");
		//Pyramid pattern
		int a = 5;
		for(int i = 1; i <= a; i++) {
		    for(int j = 1; j <= a - i; j++) {
		        System.out.print(" ");
		    }
		    for(int j = 1; j <= 2*i - 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println("____________");
		//Find duplicate elements in an array
		
		int[] arr = {1, 2, 3, 2, 4, 5, 1};
		for(int i = 0; i < arr.length; i++) {
		    for(int j = i+1; j < arr.length; j++) {
		        if(arr[i] == arr[j]) {
		            System.out.println(arr[i]);
		        }
		    }
		}
		System.out.println("_________");
		int[] ar = {1, 2, 3};
		for(int i = 0; i < ar.length; i++) {
		    for(int j = 0; j < ar.length; j++) {
		        System.out.println("(" + ar[i] + ", " + ar[j] + ")");
		    }
		}

	}

}
