package JavaAssignment;

public class StringConcept {

	public static void main(String[] args) {
		String s = "Sangita";
		String s1 = "  Amatya ";

		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s.concat(s1).trim());
		System.out.println(s1.trim());
		System.out.println(s.charAt(1));
		System.out.println(s.equals("sangita"));
		System.out.println(s.equalsIgnoreCase("sangita"));
		System.out.println(s.contains("san"));
		System.out.println(s.contains("ama"));
		System.out.println(s1.equalsIgnoreCase("  Amatya"));

	}

}
