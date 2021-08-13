package AppleProgramming;

public class ReverseCharacterword {

	public static void main(String[] args) {
		String Name = "This is my car";
		StringBuilder reverseString = new StringBuilder();

		String[] words = Name.split(" "); // step 1

		for (String word : words) {
			String reverseWord = new StringBuilder(word).reverse().toString();
			// step 2
			reverseString.append(reverseWord + " "); // step 3
		}

		System.out.println(reverseString.toString().trim());
		// verify reversed string
	}
}