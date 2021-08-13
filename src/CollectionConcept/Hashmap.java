package CollectionConcept;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		// Create a HashMap object called people
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "sangggita");
		map.put(2, "amagtya");
		for (int i : map.keySet()) {
			System.out.println("Key  = " + i + " value = " + map.get(i));
		}
		if (map.containsKey(1)) {
			System.out.println("name is present : " + map.get(1));
		} else {
			System.out.println("name is not present ");
		}
	}

}
