package ApexAssignment;

public class StringBufferEg {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			sb.append(alphabet);
			System.out.println(alphabet);
			// System.out.println(sb.toString());
		}

	}

}
