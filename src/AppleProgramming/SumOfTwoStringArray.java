package AppleProgramming;

import java.util.Arrays;

public class SumOfTwoStringArray {
	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 0 };
		int[] b = { 3, 4, 5, 8 };
		int[] result = add(a, b);
		System.out.println("Frist array covert to string: " + Arrays.toString(a));
		System.out.println("Second array covert to string: " + Arrays.toString(b));
		System.out.println("Sum of 2 array is " + Arrays.toString(result));
	}

	public static int[] add(int[] a, int[] b) {

		int length;
		if (a.length < b.length) {
			length = a.length;
			// System.out.println("length : " + length);
		} else {
			length = b.length;
			// System.out.println("B length : " + length);
		}
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[i] + b[i];
		}

		return result;
	}

}
