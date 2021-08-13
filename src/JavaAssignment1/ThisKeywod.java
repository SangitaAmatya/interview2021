package JavaAssignment1;

public class ThisKeywod {
	int a;
	int b;

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void printvalue() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		ThisKeywod th = new ThisKeywod();
		th.add(10, 20);
		th.printvalue();

	}

}
