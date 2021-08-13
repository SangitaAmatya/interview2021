package Interview2021;

public class MoveZeroToEOArray {

	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		int count = 0;
		int temp;

		// Traverse the array. If arr[i] is
		// non-zero, then swap the element at
		// index 'count' with the element at
		// index 'i'
		for (int i = 0; i < n; i++) {
			if ((arr[i] != 0)) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count = count + 1;
			}

		}
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}