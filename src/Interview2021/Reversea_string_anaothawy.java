package Interview2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

// Class of ReverseString
class Reverse_string {
	public static void main(String[] args) {
		String input = "Geeks For Geeks";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();

		for (char c : hello)
			trial1.add(c);

		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());
	}
}
