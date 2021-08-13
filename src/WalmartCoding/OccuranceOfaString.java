package WalmartCoding;

import java.util.Scanner;

public class OccuranceOfaString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		int result = 0;
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					result++;
				}
			}
			System.out.printf("%s :", strArray[i]);
			System.out.printf("%d\n", result);
			result = 0;
		}
	}
}