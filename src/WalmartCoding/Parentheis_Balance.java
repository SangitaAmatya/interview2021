package WalmartCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Parentheis_Balance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your expression.");
		String newbraces = in.next();
		if (isBalanced(newbraces)) {
			System.out.println("Its is balance patenthis");
		} else {

			System.out.println("Its is not a  balance patenthis");

		}

	}

	public static boolean isBalanced(String brackets) {
		// set matching pairs

		Map<Character, Character> braces = new HashMap<>();
		braces.put('(', ')');
		braces.put('{', '}');
		braces.put('[', ']');

//if length of string is odd, then it is not balanced
		if (brackets.length() % 2 != 0) {
			return false;
			// travel half until openings are found and compare with
			// remaining if the closings matches
		}
		Stack<Character> halfbraces = new Stack();

		for (char ch : brackets.toCharArray()) {
			if (braces.containsKey(ch)) {
				halfbraces.push(braces.get(ch));

			}
			// if stack is empty or if closing bracket is not equal to top of stack,
			// then braces are not balanced
			else if (halfbraces.isEmpty() || ch != halfbraces.pop()) {

				return false;
			}
		}
		return halfbraces.isEmpty();
	}
}