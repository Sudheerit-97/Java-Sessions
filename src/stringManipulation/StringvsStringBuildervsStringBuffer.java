package stringManipulation;

public class StringvsStringBuildervsStringBuffer {

	public static void main(String[] args) {
         // Immutable
		String st = "hello";
		st.concat("selenum");
		System.out.println(st);
		
		StringBuilder str = new StringBuilder("hellonew");
		str.append("   java");
		str.append("    selenium");
		System.out.println(str);
		
		
	}

}
