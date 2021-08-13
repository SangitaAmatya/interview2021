package VisaProgramming;

public class PairOfsumSimple {

	// Prints number of pairs in arr[0..n-1] with sum equal
	// Time Complexity : O(n2)
	public static void getPairsCount(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			int first = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int second = arr[j];
				if ((first + second) == sum)
					System.out.printf("(%d, %d) %n", first, second);

			}
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		getPairsCount(arr, sum);
	}
}