package Interview2021;

import java.util.LinkedHashSet;

public class Unique_character_String {
	public static void main(String[] args) {
		String name = "INFOSYS";

		LinkedHashSet set = new LinkedHashSet();

		for (int i = 0; i < name.length(); i++) {
			boolean status = set.contains(name.charAt(i));
			if (!status) {
				set.add(name.charAt(i));
			}
		}
		System.out.println(set);
	}

}
