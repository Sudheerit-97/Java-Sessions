package mapconcept;

import java.util.Hashtable;

public class HasHTable {

	public static void main(String[] args) {
		//Thread safe
		// null values are not allowed
		// performance poor
		// one method will completed then it will be worling 
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();

		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		// t.put(null,"X"); //NullPointerException
		// t.put(104, null); //NullPointerException

		System.out.println(t); // {103=Smith, 102=David, 101=John}

		System.out.println(t.get(103)); // Smith

		t.remove(103);
		System.out.println(t); // {102=David, 101=John}

		System.out.println(t.containsKey(102)); // true
		System.out.println(t.containsKey(105)); // false

		System.out.println(t.containsValue("David")); // true
		System.out.println(t.containsValue("Y")); // False

		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());

	}

}
