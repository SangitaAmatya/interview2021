package AppleProgramming;

import java.util.ArrayList;

public class SumOf2string {
	public static void main(String[] args) {
		int n = 3;
		int a[] = { 6, 2, 3 };

		int b[] = { 4, 5, 6 };

		ArrayList<Object> total = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int sum = a[i] + b[i];
			total.add(sum);
		}

		Integer[] sumArray = total.toArray(new Integer[total.size()]);
		for (int i = 0; i < n; i++) {
			System.out.print(sumArray[i] + " ");
		}

	}
}