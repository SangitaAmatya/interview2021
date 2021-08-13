package VisaProgramming;

import java.util.ArrayList;

public class CommonElementInList {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("sangita");
		name.add("amatya");
		name.add("Adyansh");
		name.add("Adity");
		for (String Names : name) {
			System.out.println(Names);
		}

		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("sangita");
		name1.add("amat");
		name1.add("Adyansh");
		name1.add("Aditya");
		for (String Names1 : name1) {
			System.out.println(Names1);
		}
		// Create ArrayList list3
		ArrayList<String> Name3 = new ArrayList<String>();

		// Find common elements
		// while iterating through name1
		for (String temp : name) {

			// Check if theis element is
			// present in list2 or not
			if (name1.contains(temp)) {

				// Since present, add it to list3
				Name3.add(temp);
			}
		}

		// print common elements from list 3
		System.out.println("Common elements: " + Name3);
	}

}
