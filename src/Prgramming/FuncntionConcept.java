package Prgramming;

import java.util.ArrayList;

public class FuncntionConcept {
	public int sum() {

		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println("Sum" + c);
		return c;

	}

	public ArrayList<String> StudentName() {

		ArrayList<String> Name = new ArrayList<String>();

		Name.add("Mayara");
		Name.add("Mayara1");
		Name.add("Mayara2");
		Name.add("Mayara");
		Name.add("Mayara3");
		for (int i = 0; i < Name.size(); i++) {
			System.out.println(Name.get(i));
		}
		return Name;
	}

	public int[] StudentMark() {
		int mark[] = new int[4];
		mark[0] = 76;
		mark[1] = 89;
		System.out.println((1));
		return mark;
	}

	public String getCountyName(String cityName) {

		System.out.println("Print the country name");

		if (cityName.equals("Banglore")) {
			return "India";

		} else if (cityName.equals("SantaClara")) {
			return "USA";

		} else if ((cityName.equals("London")))
			return "UK";
		else {
			System.out.println("City Not found");

		}
		return cityName;

	}

	public void getCountyName() {
		// TODO Auto-generated method stub

	}
}
