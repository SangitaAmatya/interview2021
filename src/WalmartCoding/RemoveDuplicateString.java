package WalmartCoding;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		/*
		 * String S1 = "Sangita"; char[] chars = S1.toCharArray(); Set<Character> ch =
		 * new HashSet<Character>(); for (char c : chars) { ch.add(c);
		 * 
		 * } StringBuilder sb = new StringBuilder(); for (Character character : ch) {
		 * sb.append(character);
		 * 
		 * } System.out.println(sb.toString());
		 */

		String input = new String("sangita");
		String output = new String();

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < output.length(); j++) {
				if (input.charAt(i) != output.charAt(j)) {
					output = output + input.charAt(i);
				}
			}
		}

		System.out.println(output);

	}

}
