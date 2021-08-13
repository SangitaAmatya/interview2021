package ApexAssignment;

import java.util.Scanner;

public class RockPapersissor {

	final static String SCISSOR = "s";
	final static String ROCK = "r";
	final static String PAPER = "p";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Character R(ock), P(aper), S(cissor) ");
		String userInput = scanner.next();
		System.out.println(userInput);

		if (userInput.equalsIgnoreCase(SCISSOR) || userInput.equalsIgnoreCase(ROCK)
				|| userInput.equalsIgnoreCase(PAPER)) {
			String[] charNames = { "R", "P", "S" };
			// System.out.println("Computer Selected "+charNames[2]);
			int indexValue = (int) (Math.random() * (2 - 0));
			String cmpValue = charNames[indexValue];
			System.out.println("Computer Selected  " + cmpValue);

			if (userInput.equalsIgnoreCase(PAPER) && cmpValue.equalsIgnoreCase(ROCK)) {
				System.out.println("You win!");
			} else if (userInput.equalsIgnoreCase(ROCK) && cmpValue.equalsIgnoreCase(ROCK)) {
				System.out.println("Both loss!");
			} else if (userInput.equalsIgnoreCase(SCISSOR) && cmpValue.equalsIgnoreCase(ROCK)) {
				System.out.println("Computer win!");
			} else if (userInput.equalsIgnoreCase(PAPER) && cmpValue.equalsIgnoreCase(PAPER)) {
				System.out.println("Both loss!");
			} else if (userInput.equalsIgnoreCase(ROCK) && cmpValue.equalsIgnoreCase(PAPER)) {
				System.out.println("Computer win!");
			} else if (userInput.equalsIgnoreCase(SCISSOR) && cmpValue.equalsIgnoreCase(PAPER)) {
				System.out.println("You win!");
			} else if (userInput.equalsIgnoreCase(PAPER) && cmpValue.equalsIgnoreCase(SCISSOR)) {
				System.out.println("Computer win!");
			} else if (userInput.equalsIgnoreCase(ROCK) && cmpValue.equalsIgnoreCase(SCISSOR)) {
				System.out.println("You win!");
			} else if (userInput.equalsIgnoreCase(SCISSOR) && cmpValue.equalsIgnoreCase(SCISSOR)) {
				System.out.println("Both loss");
			} else {
				System.out.println("Something Went Wrong!");
			}

		} else {
			System.out.println("You selected wrong character");
		}

	}

}
