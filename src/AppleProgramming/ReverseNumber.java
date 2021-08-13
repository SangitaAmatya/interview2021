package AppleProgramming;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int reverseNumber = 0;

		int rem = 0;

		while (number != 0) {
			rem = number % 10;
			reverseNumber = reverseNumber * 10 + rem;
			number = number / 10;

			System.out.println(reverseNumber);
		}
	}
}