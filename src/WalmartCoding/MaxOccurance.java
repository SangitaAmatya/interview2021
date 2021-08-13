package WalmartCoding;

public class MaxOccurance {

	public static void main(String[] args) {
		String str = "sangittat";
		int[] strlength = new int[str.length()];
		// char minChar = str.charAt(0),
		char maxChar = str.charAt(0);
		int i, j, max;

		// Converts given string into character array
		char string[] = str.toCharArray();

		// Count each word in given string and store in array freq
		for (i = 0; i < string.length; i++) {
			strlength[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					strlength[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}

		// Determine minimum and maximum occurring characters
		max = strlength[0];
		for (i = 0; i < strlength.length; i++) {

			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < strlength[i]) {
				max = strlength[i];
				maxChar = string[i];
			}
		}

		System.out.println("Maximum occurring character: " + maxChar);
	}
}