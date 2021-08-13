package Interview2021;

import java.util.HashMap;

public class OccurenceOfastring_hahhmap {
	public static void main(String[] args) {
		String str = "java";
		HashMap<Character, Integer> hMap = new HashMap<>();
		// travese the string
		for (Character c : str.toCharArray()) {
//check current character is present in the string or not if present
			if (hMap.containsKey(c)) {
//add the prevesious character  addded to it 
				hMap.put(c, hMap.get(c) + 1);
			} else {

				// if it not set charcter
				hMap.put(c, 1);
			}
		}
		System.out.println(hMap);
	}
}