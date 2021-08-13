package ArrylistProgramming;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistimplementIteraror {

	public static void main(String[] args) {
		ArrayList<String> Nm = new ArrayList<String>();

		Nm.add("sangita");
		Nm.add("sangitaamatya");
		Nm.add("Adyansh panigrahi");
		Iterator it = Nm.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		if (Nm.contains("sangita"))
			System.out.println("Name is present");
		else
			System.out.println("Name is not present");

		for (String Nmaes : Nm) {
			System.out.println("Names iteratir :" + Nmaes);

			if (Nmaes.contains("sangita"))
				System.out.println("Name is present");
			else
				System.out.println("Name is not present");
		}

	}
}