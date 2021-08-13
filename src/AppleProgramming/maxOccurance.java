package AppleProgramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class maxOccurance {
	/*
	 * initialize a HashMap with Key as character and value as count. Iterate over
	 * input string. If character is already present in HashMap, then increment the
	 * count else put the value as 1. Keep the track of maximum count in the
	 * process. Once we are done with iterate, iterate over HashMap and find
	 * character with the help of maximum count.
	 */
	static void findMaximumOccurring(String str1) {
		int maximumCount = 0;
		HashMap<Character, Integer> characterCountMap = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (characterCountMap.containsKey(c)) {
				int count = characterCountMap.get(c);
				count++;
				if (maximumCount < count)
					maximumCount++;
				characterCountMap.put(c, count);
			} else {
				characterCountMap.put(c, 1);
			}
		}

		Set<Character> set = characterCountMap.keySet();
		Iterator<Character> iterator = set.iterator();
		while (iterator.hasNext()) {
			char key = iterator.next();
			// check count
			if (characterCountMap.get(key) == maximumCount) {
				System.out.println("Character: " + key + " has occurred maximum times in String:  " + maximumCount);
			}
		}
	}

	public static void main(String[] args) {
		String str1 = "sangieeeta amatya";
		System.out.println("String 1: " + str1);
		findMaximumOccurring(str1);

	}
}
