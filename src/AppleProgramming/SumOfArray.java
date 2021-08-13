package AppleProgramming;

public class SumOfArray {

	public static void findpair(int A[], int sum) {

		for (int i = 0; i < A.length; i++) {
			int first = A[i];
			for (int j = i + 1; j < A.length; j++) {
				int second = A[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);

					// Using index
					// each element except last element
					/*
					 * for (int i = 0; i < A.length - 1; i++) { // start from i th element till last
					 * element
					 * 
					 * for (int j = i + 1; j < A.length; j++) { if (A[i] + A[j] == sum) {
					 * System.out.println("pair found at index " + i + "and " + j); return;
					 */
				}
			}
		}

		System.out.println("pair not found");
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8, 8 };
		int sum = 16;
		findpair(A, sum);

	}
}
