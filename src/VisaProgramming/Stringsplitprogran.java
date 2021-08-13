package VisaProgramming;

public class Stringsplitprogran {

	public static void main(String[] arg) {
		String str = "Welcome, dear, guest";
		String[] arrOfStr = str.split(",");
		for (String a : arrOfStr)
			System.out.println(a);
	}
}