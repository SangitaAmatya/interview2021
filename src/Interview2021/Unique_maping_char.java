package Interview2021;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique_maping_char {
	{
		System.out.println("Enter input: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		LinkedHashMap<Character, Integer> list = new LinkedHashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (list.containsKey(c)) {
				list.put(c, list.get(c) + 1);
			} else {
				list.put(c, 1);
			}
		}
		for (Map.Entry e : list.entrySet()) {
			if ((int) e.getValue() == 1)
				System.out.println(e.getKey());
		}
	}
}