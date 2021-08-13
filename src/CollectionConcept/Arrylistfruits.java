package CollectionConcept;

import java.util.ArrayList;

public class Arrylistfruits {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("bannaa");
		fruits.add("Orange");
		fruits.add("GreenApple");
		// Ierating using for loop
		// for (int i = 0; i < fruits.size(); i++) {
		// System.out.println(fruits.get(i));
		System.out.println("************************************");
		// }
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		String FruitsIndex = fruits.get(2);
		System.out.println("Fruits at index 2 is: " + FruitsIndex);

		if (fruits.contains("Apple"))

			System.out.println("The list present in apple");

		else {
			System.out.println("Not in the list");

		}

	}
}
