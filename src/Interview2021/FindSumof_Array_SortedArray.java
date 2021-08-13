package Interview2021;

public class FindSumof_Array_SortedArray {
	public static void main(String[] args) {

		// Sorted array with distinct elements
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 9;

		// i) To solve this problem, let’s take two indexes low and high
		// and assign a value zero and array length -1.
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
//i) Traverse an array from both the ends and increment the value of 
			// low and high
			// based on whether the sum of arr[low] + arr[high] is greater
			// or less than the given sum
			/*
			 * if sum of arr[low] + arr[high] is greater than the value of sum then
			 * decrement the value of high.
			 */
			if ((arr[low] + arr[high]) > sum) {
				high--;

			} else if ((arr[low] + arr[high]) < sum) {
				low++;

			} else if ((arr[low] + arr[high]) == sum) {
				System.out.println(" Pair (" + arr[low] + " , " + arr[high] + " )");
				low++;
				high--;
			}
		}
	}
}
