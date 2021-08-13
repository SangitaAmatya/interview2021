package ApexAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class USAState {

	public static void main(String[] args) {

		// Define a class with three fields state code, state name and capitals. And
		// define 10 states. And save in an arraylist.
		// And, print all the objects.
		List<String> StateCode = Arrays.asList("95111", "95112", "95112");
		for (String StateCodes : StateCode) {
			System.out.println("StateCodes USA :" + StateCodes);
		}

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

	}

}
