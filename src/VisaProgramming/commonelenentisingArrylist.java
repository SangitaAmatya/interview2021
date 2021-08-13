package VisaProgramming;

import java.util.ArrayList;

public class commonelenentisingArrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		for (int li : list1) {
			System.out.println(li);
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(7);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		for (int li1 : list2) {
			System.out.println(li1);

		}
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int temp : list1) {
			// Check if theis element is
			// present in list2 or not
			if (list2.contains(temp)) {
				list3.add(temp);
			}
		}
		System.out.println("common element is :" + list3);
	}

}
