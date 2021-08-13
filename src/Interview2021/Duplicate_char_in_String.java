package Interview2021;

public class Duplicate_char_in_String {
//Method 1: Using two nested for loops. First, create an outer for loop
	// and an inner for loop. Inside of the inner for loop, use the .charAt()
	// method to compare the char from the outer loop to the char of the inner loop.
	// If they are the same, then you have a duplicate in your
	// string, and it does not contain all unique characters.
	public static void main(String[] args) {
		String string1 = "sanngggta";

		// Converts given string into character array
		char string[] = string1.toCharArray();

		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {

			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					System.out.println("Duplicate characters in a given string: " + string[j]);
					break;

				}
			}
		}

	}
}
