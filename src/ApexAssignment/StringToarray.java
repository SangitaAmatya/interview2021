package ApexAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToarray {
	public static void main(String[] args) {
		String name = "Apple, Google, Samsung";
		// step one : converting comma separate String to array of String
		String[] elements = name.split(",");
		// step two : convert String array to list of String

		List<String> fixedLenghtList = Arrays.asList(elements);
		ArrayList<String> listOfString = new ArrayList<String>(fixedLenghtList);
		System.out.println("list from comma separated String : " + listOfString);
		System.out.println("size of ArrayList : " + listOfString.size());

	}
}