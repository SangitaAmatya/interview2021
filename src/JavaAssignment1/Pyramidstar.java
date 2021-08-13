package JavaAssignment1;

public class Pyramidstar {

	public static void main(String[] args) {

		int number = 8;

		for (int i = number; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}