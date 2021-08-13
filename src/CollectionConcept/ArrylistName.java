package CollectionConcept;

import java.util.ArrayList;
import java.util.List;

public class ArrylistName {

	public static void main(String[] args) {

		List<String> namelist = new ArrayList<String>();
		namelist.add("Sangita amatya");
		namelist.add("Sangita panigrahi");
		namelist.add("Adyansh panigrahi");
		namelist.add("Aditya panigrahi");
		namelist.add("aru ");
		for (String Names : namelist)
			System.out.println(Names);

		System.out.println(namelist.get(1));
		if (namelist.contains("Sangita panigrahi"))

			System.out.println("Name is present in the list");

		else {

			System.out.println("Name is not present");
		}

	}
}
