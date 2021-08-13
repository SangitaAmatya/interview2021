package ApexAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class UsaStateArryList {

	public static void main(String[] args) {

		List<String> State = new ArrayList<String>();
		State.add("Carlifonia");
		State.add("Texas");
		State.add("Nevada");
		State.add("Wa");
		State.add("Wa");
		for (String States : State) {

			System.out.println("State Name of Usa : " + States);
		}
		List<String> StateCityName = Arrays.asList("santaclara", "sanjose", "Dublin");
		for (String StateCityNames : StateCityName) {
			System.out.println("City of Ca :  " + StateCityNames);
		}

		System.out.println("***********************************");

		HashSet<String> h = new HashSet<String>();
		h.add("CALIFONIA");
		h.add("WA");
		h.add("OH");
		h.add("NEVAD");
		h.add("NEVAD");
		h.add("");

		// adding duplicate elements

		for (String State1 : h) {
			System.out.println("State Name of Usa : " + State1);
		}
		System.out.println("***********************************");
		TreeSet<String> TS = new TreeSet<String>();
		TS.add("CALIFONIA");
		TS.add("WA");
		TS.add("OH");
		TS.add("NEVAD");
		TS.add("NEVAD");
		TS.add("");
		for (String State2 : TS) {
			System.out.println("State Name of Usa : " + State2);
		}
	}
}