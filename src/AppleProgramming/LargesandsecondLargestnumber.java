package AppleProgramming;

public class LargesandsecondLargestnumber {

	public static void main(String[] args) {
		int a[] = { 45, 89, 38, 9, 65, 34 };
		int largest = Integer.MIN_VALUE;
		int secong_largest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secong_largest = largest;
				largest = a[i];

			} else if (a[i] > secong_largest && a[i] != largest)

			{
				secong_largest = a[i];

			}

		}

		if (secong_largest == Integer.MIN_VALUE) {
			System.out.println(secong_largest);

		}
	}
}
