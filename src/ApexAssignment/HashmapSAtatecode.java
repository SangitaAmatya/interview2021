package ApexAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapSAtatecode {

	public static void main(String[] args) {

		HashMap Statecode = new HashMap();
		Statecode.put("95111", "San jose");

		Statecode.put("95112", "Ever Green");
		Statecode.put("95113", "Santa Clara");
		System.out.println(Statecode);
		// Getting a Set of Key-value pairs
		Set entrySet = Statecode.entrySet();

		// Obtaining an iterator for the entry set
		Iterator it = entrySet.iterator();

		// Iterate through HashMap entries(Key-Value pairs)
		System.out.println("HashMap Key-Value Pairs : ");
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println("Key is: " + me.getKey() + " & " + " value is: " + me.getValue());
		}

	}

}
