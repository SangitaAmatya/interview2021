package ApexAssignment;

import java.util.Scanner;

public class Fibonaccis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = s.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}