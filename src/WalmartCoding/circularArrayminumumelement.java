package WalmartCoding;

public class circularArrayminumumelement {

	private static int findMin(int[] array, int startIndex) {
		int min = array[startIndex];
		int currentIndex = startIndex;
		do {
			if (array[currentIndex++] < min) {
				min = array[currentIndex - 1];
			}
			if (currentIndex > array.length - 1) {
				currentIndex = 0;

			}
		} while (currentIndex != startIndex);
		return min;
	}

	// driver function
	public static void main(String argc[]) {
		int[] a = new int[] { 5, 7, 9, 2, 4, 5, 6, 3, 1, 3 };
		int n = 6;
		// print(a, n, 3);
		System.out.println("result====" + findMin(a, a.length - 1));
	}
}