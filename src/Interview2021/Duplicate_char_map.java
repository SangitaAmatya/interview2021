package Interview2021;

import java.util.HashMap;
import java.util.Map;

//Pseudo steps

//Split the string into character array.
//Iterate over character array.
//For each iteration, use character as map key and check is same character is present in map,
//already.
//If map key does not exist it means the character has been encountered first time. 
//Store it in map with count value to 1.
//If map key exist, increment the counter.
//Repeat until all characters in array has been iterated.
//Check map. Duplicate characters have count more than 1.
//Distinct characters will have count as 1.

public class Duplicate_char_map {
	public static void main(String[] args) {
		String Name = "sanngggg";
		char[] chars = Name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : chars) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println("Duplicate characters:");

		// Print duplicate characters
		for (char c : map.keySet()) {
			if (map.get(c) > 1) {
				System.out.println(c);
			}
		}

	}
}