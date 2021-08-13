package ApexAssignment;

public class StringBuilderEg {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (char Alphabet = 'A'; Alphabet <= 'Z'; Alphabet++) {
			sb.append(Alphabet);
			System.out.println(Alphabet);
		}
	}

}
