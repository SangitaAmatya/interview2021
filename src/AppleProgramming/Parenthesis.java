package AppleProgramming;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	// java Parentheses [()]{}{[()()]()}
	/*
	 * for each element in the string i=0 We have an opening braces so we push it to
	 * the stack. Stack: { i=1 We have an opening braces so we push it to the stack.
	 * Stack: [ { i=2 We have an opening braces so we push it to the stack. Stack: (
	 * [ { i=3 We have an closing braces so we pop the element from stack. Popped
	 * element: ( Closing braces: ) We continue to iterate because the opening
	 * braces is associated with the closed braces. Stack: [ { i=4 We have an
	 * closing braces so we pop the element from stack. Popped element: [ Closing
	 * braces: ] We continue to iterate because the opening braces is associated
	 * with the closed braces. Stack: { i=5 We have an closing braces so we pop the
	 * element from stack. Popped element: { Closing braces: } We continue to
	 * iterate because the opening braces is associated with the closed braces.
	 * Stack: Empty The stack is empty which means that we have an equal equal
	 * number of closing braces for all opening braces.
	 */

	public static void main(String args[]) {
		System.out.println("Balanced Expression");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		if (isExpressionBalanced(input)) {
			System.out.println("The expression is balanced");
		} else {
			System.out.println("The expression is not balanced");
		}
	}

	static boolean isExpressionBalanced(String input) {
		Stack stack = new Stack();
		for (int i = 0; i < input.length(); i++) {
			/**/
			if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
				stack.push(input.charAt(i));
			}
			if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
				if (stack.empty()) {
					return false;
				}
				char top_char = (char) stack.pop();

				if ((top_char == '(' && input.charAt(i) != ')') || (top_char == '{' && input.charAt(i) != '}')
						|| (top_char == '[' && input.charAt(i) != ']')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
