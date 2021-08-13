package AppleProgramming;

public class PallindromString {
	public static void main(String[] args) {
		String str = "$$mom$11$";

		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("Its a palindrom");
		else {
			System.out.println("Its is not a palindrom");
		}

	}
}