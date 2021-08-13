package AppleProgramming;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "sangita";
		char[] character = name.toCharArray();
		Set set = new HashSet();
		StringBuilder sb = new StringBuilder();
		System.out.println("Remove the Duplicate character : " + name);
		for (char c : character) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println("Duplicate String is :" + sb.toString());
	}

}
