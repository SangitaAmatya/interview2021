package ArrylistProgramming;

public class Second_largestnumber {
//The time complexity of this solution is O(nlogn).
	// Compare the first two elements of the array
	// If the first element is greater than the second swap them.
	// Then, compare 2nd and 3rd elements if the second element is greater than the
	// 3rd swap them.
	// Repeat this till the end of the array
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };

		System.out.println("Second Largest: " + getSecondLargest(a, 6));
	}
}