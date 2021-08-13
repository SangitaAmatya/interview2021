package AppleProgramming;

public class ReverseString {

	public static void main(String[] args) {
		String Name = " hi sangita";
		String Reverse = "";
		int length = Name.length();
		for (int i = length - 1; i >= 0; i--)
			Reverse = Reverse + Name.charAt(i);
		System.out.println("Reverse of the Name Sangita = " + Reverse);

	}
}