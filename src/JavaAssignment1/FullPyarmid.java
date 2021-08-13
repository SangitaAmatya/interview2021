package JavaAssignment1;

public class FullPyarmid {

	public static void main(String[] args) {

		int num = 3, k = 0;

		for (int i = 1; i <= num; ++i, k = 0) {
			for (int space = 1; space <= num - i; ++space) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}
	}
}