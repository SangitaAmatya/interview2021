package CollectionConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Arraylist_hashmap {

	HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	public static void main(String args[]) {
		Arraylist_hashmap test = new Arraylist_hashmap();
		test.("mango", 5);
		test.inputData("apple", 2);
		test.inputData("grapes", 2);
		test.inputData("peach", 3);
		test.displayData();

	}

	public void displayData() {
		for (Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " | ");
			for (int fruitNo : entry.getValue()) {
				System.out.print(fruitNo + " ");
			}
			System.out.println();
		}
	}

	/*
	 * public void inputData(String name, int number) { // Random rndData = new
	 * Random(); ArrayList<Integer> fruit = new ArrayList<Integer>(); for (int i =
	 * 0; i < number; i++) { // fruit.add(rndData.nextInt(10)); } map.put(name,
	 * fruit);
	 */
}}
