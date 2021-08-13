package ApexAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaStateCapital {

	public static List<String> states = new ArrayList<>();
	public static List<String> capitals = new ArrayList<>();
	public static List<String> Code = new ArrayList<>();

	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Store 10 states and their capitals in two lists
		getData();

		int count = 0; // Correct answer
		// Repeatedly prompt the user to enter the capital of a state
		for (int i = 0; i < states.size(); i++) {
			System.out.print("What is the capital of " + states.get(i) + " and code ? ");
			String capital = input.nextLine();

			if (isEqual(capitals.get(i), capital)) {
				System.out.println("Your answer is correct");
				count++;
			} else {
				System.out.println("capital of State and code is " + capitals.get(i) + Code.get(i));
			}
		}

		// Display the total correct count
		System.out.println("\nThe correct count is " + count);
	}

	/** isEqual returns true if a is equal to c */
	public static boolean isEqual(String c, String a) {
		if (c.length() != a.length())
			return false;

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	/** getData initializes the array with the 10 states and their capitals */
	public static void getData() {
		String[][] d = { { "Alabama", "Montgomery", "36130" }, { "Alaska", "Juneau", "36131" },
				{ "Arizona", "Phoenix", "36134" }, { "Arkansas", "Little Rock", "36630" },
				{ "California", "Sacramento", "36139" }, { "Colorado", "Denver", "361334" },
				{ "Connecticut", "Hartford", "39130" }, { "Delaware", "Dover", "36730" },
				{ "Florida", "Tallahassee", "39130" }, { "Georgia", "Atlanta", "30130" },
				{ "Hawaii", "Honolulu", "36130" }, { "Idaho", "Boise", "36130" } };
		// Seperate the states and capitals into two lists} };

		// Seperate the states and capitals into two lists
		for (int i = 0; i < d.length; i++) {
			states.add(d[i][0]);
			capitals.add(d[i][1]);
			Code.add(d[i][2]);
		}

	}
}
