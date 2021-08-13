package CollectionConcept;

import java.util.ArrayList;

public class ArrlistConcept {

	public static void main(String[] args) {
		ArrayList<String> Ary = new ArrayList<String>();

		Ary.add("sangita1");

		for (String Name : Ary) {
			System.out.println(Name);

			if (Name.equals("sangita")) {
				System.out.println("correct");
			} else {
				System.out.println("not correct");
			}

		}
	}
}
