package Prgramming;

import java.util.ArrayList;

public class ClassandObject {
	int age = 29;
	String name = "Aryan";
	ArrayList<String> sub = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dregee = "ms";
		ClassandObject nm = new ClassandObject();

		System.out.println("Name of the Student Age  " + nm.age);
		System.out.println("Name of the Student" + nm.name);
		System.out.println("He is doing " + Dregee);
		nm.Intership();
		nm.Courses();

	}

	public void Intership() {
		int jobhour = 20;

		System.out.println("He can can do Intership = " + jobhour);

	}

	public void Courses() {
		ArrayList<String> sub = new ArrayList();
		sub.add("Algorithms");
		sub.add("SoftwareEngineering");
		sub.add("Qa");
		for (int i = 0; i < sub.size(); i++) {
			System.out.println("Courses of the MS " + sub.get(i));

		}
	}
}
