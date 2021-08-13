package AppleProgramming;

public class FirsAndSecondLargestNumberArray {

	public static void main(String[] args) {
		int number[] = { 1, 45, 78, 56, 89 };

		int temp;
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
//smaller
				if (number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}

		}
		// System.out.println("Firstnumber = " + number[0]);
		System.out.println("second number = " + number[1]);

	}

}
