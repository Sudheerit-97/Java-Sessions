package arrayListConcept;

import java.util.AbstractMap;
import java.util.Map;

public class Jdk8ArrayList {

	public static void main(String[] args) {
		   Map<String, String> emptyMap = Map.of();
	        // emptyMap.put("Tom", "v1"); // UnsupportedOperationException
	        // System.out.println(emptyMap);

	        // Singleton Map
	        Map<String, String> singletonMap = Map.of("k1", "v1");
	        System.out.println(singletonMap);
	        // singletonMap.put("k2", "v2"); // UnsupportedOperationException

	        // Multi-value Map (maximum 10 key-value pairs)
	        Map<String, String> multipleMap = Map.of(
	                "k1", "v1",
	                "k2", "v2",
	                "k3", "v3"
	        );

	        System.out.println(multipleMap.get("k3"));
	        
	        // Immutable Map using Map.ofEntries()
	        Map<String, Integer> map7 = Map.ofEntries(
	                new AbstractMap.SimpleEntry<>("A", 100),
	                new AbstractMap.SimpleEntry<>("B", 200),
	                new AbstractMap.SimpleEntry<>("C", 300)
	        );

	        System.out.println(map7.get("C"));

	        // map7.put("D", 400); // UnsupportedOperationException
	        
	        //2nd way 
	        Map<String, Integer> map = Map.ofEntries(
	                Map.entry("A", 100),
	                Map.entry("B", 200),
	                Map.entry("C", 300)
	        );

	        System.out.println(map.get("C"));
	    }

	}


