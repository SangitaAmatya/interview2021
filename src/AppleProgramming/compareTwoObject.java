package AppleProgramming;

public class compareTwoObject {
	public String s;
	public int i;

	public compareTwoObject(String s, int i) {
		this.s = s;
		this.i = i;
	}

	public static void main(String[] args) {
		compareTwoObject t1 = new compareTwoObject("hello", 42);
		compareTwoObject t2 = new compareTwoObject("hello", 42);
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);
	}
}