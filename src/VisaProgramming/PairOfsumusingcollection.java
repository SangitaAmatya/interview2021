package VisaProgramming;

import java.util.HashSet;

/*
 * This method works in O(n) time.

1) Initialize an empty hash table s.
2) Do following for each element A[i] in A[]
   (a)    If s[x - A[i]] is set then print the pair (A[i], x - A[i])
   (b)    Insert A[i] into s.*/
public class PairOfsumusingcollection {
	static void getPairsCount(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition if
			if (temp >= 0 && s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		getPairsCount(arr, sum);
	}
}