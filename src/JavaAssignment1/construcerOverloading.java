package JavaAssignment1;

public class construcerOverloading {

	construcerOverloading(int a, int b) {
		System.out.println(a + b);
	}

	construcerOverloading(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		construcerOverloading ol = new construcerOverloading(1, 2);

	}

}
