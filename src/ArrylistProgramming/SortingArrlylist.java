package ArrylistProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArrlylist {

	public static void main(String[] args) {

		ArrayList<Integer> sort = new ArrayList<Integer>();
		int[] array = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
