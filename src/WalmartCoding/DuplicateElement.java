package WalmartCoding;

import java.util.HashSet;

public class DuplicateElement {
//This method is better than the Brute Force method.
	// It gives O(n) performanc
	public static void main(String[] args) {

		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (set.add(arrayElement) == false) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}
