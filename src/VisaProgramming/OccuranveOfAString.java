package VisaProgramming;

import java.util.HashMap;

public class OccuranveOfAString {
	public static void main(String[] args) {
		System.out.println(characterCount("sangitaamatya"));

	}

	static HashMap characterCount(String inputString) {
		// Creating a HashMap, key :Character value : occurrences as Integer

		HashMap<Character, Integer> CounttheOccurance = new HashMap<Character, Integer>();

		// Converting inputString to char array

		char[] charArray = inputString.toCharArray();

		// traversal of each Character of charArray

		for (char c : charArray) {
			if (CounttheOccurance.containsKey(c)) {
				// If char is present in eachCharCountMap, increment count by 1

				CounttheOccurance.put(c, CounttheOccurance.get(c) + 1);
			} else {
				// If char is not present in eachCharCountMap,
				// Putting this char to eachCharCountMap with 1 as it's initial value

				CounttheOccurance.put(c, 1);
			}
		}

		return CounttheOccurance;
	}

}