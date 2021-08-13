package CollectionConcept;

import java.util.HashMap;
import java.util.Map;

public class HashmapImplement {

	public static void main(String[] args) {
		/*
		 * Map<String, String> map = new HashMap<String, String>(); map.put("key1",
		 * "value1"); map.put("key2", "value2"); for (Map.Entry<String, String> entry :
		 * map.entrySet()) { System.out.println(entry.getKey() + " = " +
		 * entry.getValue()); }
		 */
		HashMap<Integer, String> Fruits = new HashMap<Integer, String>();
		Fruits.put(1, "Orange");
		Fruits.put(2, "Apple");
		Fruits.put(3, "Kiwi");
		Fruits.put(4, "GreenApple");
		System.out.println(Fruits);
		for (Map.Entry<Integer, String> entry : Fruits.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		for (int i : Fruits.keySet()) {
			System.out.println("Key  = " + i + " value = " + Fruits.get(i));
		}
		if (Fruits.containsKey(1)) {
			System.out.println("Fruits  presnt>>>>" + Fruits.get(1));
		} else {
			System.out.println("Apple not  presnt");
		}
	}
}
