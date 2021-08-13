package Interview2021;

public class Misssingnumber_Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];

		}
		int sum2 = 0;
//we find the range of the sum in between 1 to 5
		for (int i = 1; i <= 5; i++) {
			// total value of range
			sum2 = sum2 + i;
		}
		System.out.println("misssing number is " + (sum2 - sum1));
	}

}
