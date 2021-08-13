package Interview2021;

import java.util.HashSet;

public class unique_String {
	public static void main(String[] args) {

		String name = "INFOSYS";

		HashSet set = new HashSet();

		for (int i = 0; i < name.length(); i++) {

			if (set.contains(name.charAt(i)))
				System.out.println("unique " + set);
			else {
				set.add(name.charAt(i));
			}
		}

	}

}
