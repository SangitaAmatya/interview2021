package ApexAssignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {
	public static void main(String[] args) {

		System.out.println("Rock , Paper , Scissor Game");
		System.out.println("Please Enter Your Choice");
		System.out.println("Type 1 for rock , 2 for Paper ,3 for Scissor and Press Enter");

		Scanner choice = new Scanner(System.in);
		int rps = choice.nextInt();

		Random cChoice = new Random();
		int cChoiceRand = cChoice.nextInt(3) + 1;

		if (rps < 4 && rps > 0) {

			if (rps == 1)
				System.out.println(" You choose : Rock");

			if (rps == 2)
				System.out.println(" You choose : Paper");

			if (rps == 3)
				System.out.println("You choose : Scissor");

			if (cChoiceRand == 1)
				System.out.println("   The computer choose Rock ");

			if (cChoiceRand == 2)
				;
			System.out.println("    The computer choose paper");

			if (cChoiceRand == 3)
				;
			System.out.println("    The computer choose Scissor");

			System.out.println(" The Result is   :   ");

			if (rps == cChoiceRand)

				System.out.println("Its a tie ");

			if (rps == cChoiceRand + 1)

				System.out.println("   you win ");

			if (rps == cChoiceRand - 1)

				System.out.println(" The computer wins   ");

			if (rps == 1 && cChoiceRand == 3)

				System.out.println(" You win   ");

			if (rps == 3 && cChoiceRand == 1)

				System.out.println(" The computer wins ");

		} else {
			System.out.println(" That is not a chioce");

		}

	}

}
