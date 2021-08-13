package Prgramming;

public class solutions {

	public static void printConsucativeNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			} else {
				if (i % 2 == 0) {
					System.out.print("Codility");
				}
				if (i % 3 == 0) {
					System.out.print("Codility");
				}
				if (i % 5 == 0) {
					System.out.print("Coders");
				}
				System.out.print("\n");
			}

		}
	}

	public static void main(String[] args) {
		printConsucativeNumbers(24);
	}
}