package ArrylistProgramming;

import java.util.Arrays;

public class second_largestusing_collection {
	// array using the sort method
	// You can also sort the elements of the given array using the sort method of
	// the java.util.Arrays class then,
	// print the second element from the end of the array.
	public static void main(String args[]) {

		int array[] = { 1, 3, 5, 6, 4, 7, 34, 10, 5, 0, -2, 11 };
		int size = array.length;
		Arrays.sort(array);
		// System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
	}
}