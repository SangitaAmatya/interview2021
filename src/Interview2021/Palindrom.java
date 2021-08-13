package Interview2021;

public class Palindrom {

	public static void main(String[] args) {

		String a = "mpma", reverseStr = "";

		int len = a.length();

		for (int i = (len - 1); i >= 0; i--) {
			reverseStr = reverseStr + a.charAt(i);
		}
		System.out.println(reverseStr);

		if (a.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(a + " is a Palindrome String.");
		} else {
			System.out.println(a + " is not a Palindrome String.");
		}
	}
}