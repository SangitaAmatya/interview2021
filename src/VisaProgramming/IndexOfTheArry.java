package VisaProgramming;

public class IndexOfTheArry {
//Find the index of an array element in Java
	//// Linear-search function to find the index of an element O(N)

	public static int findIndex(int arr[], int a) {

		// if array is Null
		if (arr == null) {
			return -1;
		}

		// find length of array
		int len = arr.length;
		int i = 0;

		// traverse in the array
		while (i < len) {

			// if the i-th element is t
			// then return the index
			if (arr[i] == a) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] my_array = { 1, 2, 3, 4, 5, 6, 8 };

		// find the index of 5
		System.out.println("Index position of 5 is: " + findIndex(my_array, 5));

		// find the index of 7
		System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
	}
}