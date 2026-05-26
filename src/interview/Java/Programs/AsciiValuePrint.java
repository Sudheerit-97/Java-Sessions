package interview.Java.Programs;

public class AsciiValuePrint {

	public static void main(String[] args) {
		for (char c = 'a'; c <= 'z'; c++) {
		    System.out.println(c + " :: " + (int)c);
		}

		for (char c = 'A'; c <= 'Z'; c++) {
		    System.out.println(c + " :: " + (int)c);
		}

		for (char c = '0'; c <= '9'; c++) {
		    System.out.println(c + " :: " + (int)c);
		}

	}

}
