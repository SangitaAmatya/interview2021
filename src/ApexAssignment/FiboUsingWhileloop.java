package ApexAssignment;

public class FiboUsingWhileloop {

	public static void main(String[] args) {
		int i = 1, n = 10, n1 = 0, n2 = 1;
		while (n1 <= n) {
			System.out.println(n1);
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}

	}

}
