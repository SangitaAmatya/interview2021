package VisaProgramming;

import java.util.HashMap;
import java.util.Map;

public class HashmapSumOfPair {

	public static void main(String[] args) {
		int a[] = { 1, 5, 6, -1, 6, 8, -2 };

	}

	public static void printSumPairs(int[] input, int k) {

		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			if (pairs.containsKey(input[i]))
				System.out.println(input[i] + ", " + pairs.get(input[i]));
			else
				pairs.put(k - input[i], input[i]);
		}

	}
}
