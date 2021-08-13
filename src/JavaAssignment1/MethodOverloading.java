package JavaAssignment1;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		MethodOverloading ol = new MethodOverloading();
		ol.add(2, 3);
		ol.add(2, 3, 6);
	}

}
