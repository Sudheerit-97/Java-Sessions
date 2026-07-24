package interview.Java.Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetedCharcter {

	public static void main(String[] args) {

        String str = "abbccdffe";

        Map<Character, Integer> map =
                new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(
                        "First Non-Repeated Character: "
                        + entry.getKey());
                break;
            }
        }
	}

}
