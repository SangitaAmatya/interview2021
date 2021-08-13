package JavaAssignment1;

import java.util.Scanner;

public class PrintnegetiveAndPositine {

	public static void main(String[] args) {
		/*
		 * int i = -10; if (i > 0) { System.out.println("Number is positive"); } else {
		 * System.out.println("Number is negetive");
		 */
		int Numbers;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user input");
		Numbers = scan.nextInt();

		if (Numbers > 0) {
			System.out.println("it is a positive number");
		} else {
			System.out.println("it is a negetive number");
		}
	}
}
