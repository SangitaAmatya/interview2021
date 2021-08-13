package VisaProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaisofSumUsingList {

	public static void main(String args[]) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		System.out.println(numberOfPairs(arr, sum));

	}

	static int numberOfPairs(int[] a, int k) {
		List<List<Integer>> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int element : a) {
			List<Integer> list = new ArrayList<>();
			if (map.containsKey(element)) {
				list.add(element);
				list.add(map.get(element));
				if (!res.contains(list))
					res.add(list);

			} else
				map.put(k - element, element);
		}
		return res.size();
	}

}
