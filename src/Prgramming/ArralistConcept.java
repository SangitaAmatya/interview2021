package Prgramming;

import java.util.ArrayList;

public class ArralistConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add("sangita");
		arr.add("mama");
		arr.add("mama1");
		arr.add("mama3");
		System.out.println(arr.size());
		System.out.println(arr.get(3));
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		ArrayList<String> arr1 = new ArrayList<String>();

		arr1.add("amatya");
		arr1.add("adyansh");
		for (int i1 = 0; i1 < arr1.size(); i1++) {
			System.out.println(arr1.get(i1));

		}

	}
}