package ApexAssignment;

import java.util.*;

public class UsaCode {

	public static void main(String[] args) {
		List<String> states = new ArrayList<>();
		List<String> capitals = new ArrayList<>();
		List<String> Code = new ArrayList<>();

	}

	// Create a Scanner
	Scanner input = new Scanner(System.in);

	// Store 50 states and their capitals in two lists

	int count = 0; // Correct answer
	// Repeatedly prompt the user to enter the capital of a state
	for(
	int i = 0;i<states.size();i++)
	{
		System.out.print("What is the capital of " + states.get(i) + "? ");
		String capital = input.nextLine();

		if (isEqual(capital.get(i), capital)) {
			System.out.println("Your answer is correct");
			count++;
		} else {
			System.out.println("The correct answer should be " + capital.get(i));
		}
	}

	// Display the total correct count
	System.out.println("\nThe correct count is "+count);

}

/** getData initializes the array with the 10 states and their capitals */
public static void getData() 
{
	String[][] d = {
		{"Alabama", "Montgomery","36130"}, {"Alaska", "Juneau","36131"}, {"Arizona", "Phoenix","36134"},
		{"Arkansas", "Little Rock","36630"}, {"California", "Sacramento","36139"},
		{"Colorado", "Denver","361334"}, {"Connecticut", "Hartford","39130"}, 
		{"Delaware", "Dover","36730"}, {"Florida", "Tallahassee","39130"}, 
		{"Georgia", "Atlanta","30130"},{"Hawaii", "Honolulu","36130"}, {"Idaho", "Boise","36130"}};
	// Seperate the states and capitals into two lists
			for (int i = 0; i < d.length; i++) {
				List<String> states;
				states.add(d[i][0]);
				//List<String> capitals;
				List<String> capitals;
				capitals.add(d[i][1]);
				List<String> Code;
				
			
			Code.add(d[i][2]);
			}
		
}
}}