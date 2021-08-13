package AppleProgramming;

public class ReverseCharacter {

	// Driver methods to test above method
	public static void main(String[] args) {
		String str = "This is my car";
		String str1[] = str.split(" ");
		String finalstr = "";
		// 2nd reverse

		// Reverse the String

		for (int i = str1.length - 1; i >= 0; --i) {
			finalstr += str1[i] + " ";

		}
		System.out.println(finalstr);
	}
}