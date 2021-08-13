package Interview2021;

public class SumOfpairwithoutisingcollection {

	public static void main(String[] args) {

		int A[] = { 3, 4, 6, 3, 5, 1, 0 };
		int sum = 6;
		findpair(A, sum);
	}

	public static void findpair(int A[], int sum) {

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; i++) {
				int first = A[i];
				int second = A[j];
				if (first + second == sum) {
					System.out.println("sum of pair of two number is " + i + +j);
				}

			}

		}

	}
}