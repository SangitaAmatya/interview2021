package Interview2021;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoarry {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 3, 2, 5, 9, 11 };
		intesestion(arr1, arr2);
	}

	public static Object[] intesestion(int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
					System.out.println("Interse ction of 2 arry is  = " + arr1[i]);

				}
			}

		}

		return list.toArray();
	}
}