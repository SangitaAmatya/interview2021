package WalmartCoding;

import java.util.HashSet;
import java.util.Set;

public class SumOfPair {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 6, 8, 9, 10 };
		int sum = 10;
		PairOfNumber(input, sum);

	}

	public static void PairOfNumber(int[] input, int sum) {
		Set<Integer> pair = new HashSet<Integer>();

		for (int i = 0; i < input.length; i++) {
			int value = sum - input[i];
			pair.add(value);
			if (pair.contains(input[i])) {
				System.out.println(input[i] + " ," + (sum - input[i]));
			}

		}
	}
}
