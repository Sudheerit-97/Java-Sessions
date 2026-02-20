package learnjava;

public class SwitchCase {

	public static void main(String[] args) {
		String browser= "  	Firefox  ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		default:
		
			System.out.println("pass the correct browser");
			
			break;
		}
      // switch case is only applicable for integer and string 
	// if you want to give any grading system then we should use the else if condition
//		double d= 12.33;
//		switch (d) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		char c= 'b';
		switch (c) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
		default:
			System.out.println("pleaSE PASS THE VOWEL");
			break;
			// we can use the character
		}
	}

}
