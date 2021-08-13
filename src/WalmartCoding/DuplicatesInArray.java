package WalmartCoding;

public class DuplicatesInArray {

	// we compare each element of an array with other elements.
	// If any two elements are found equal,
	// we declare them as duplicates. The performance
	// of this method is very low if an array contains lots of elements.
	// It gives time complexity of O(n^2).
	public static void main(String[] args) {
		Integer[] strArray = { 1, 2, 2, 4, 4, 6, 8 };

		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if ((strArray[i].equals(strArray[j]))) {
					System.out.println("Duplicate Element is : " + strArray[j]);
				}
			}
		}
	}
}