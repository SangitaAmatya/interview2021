package AppleProgramming;

public class ReversAwordCharacter {
	/*
	 * Write a java program to reverse a sentence Input string = “ This is my car” 
	 * Output: car my is this  rac ym si siht  racy ms is iht  
	 */
	public static void main(String[] args) {
		String str = "This is my car";
		String str1[] = str.split(" ");
		String finalstr = "";
		// 2nd reverse
		String reverse = "";
		String reverseFinalStr = "";

		// Reverse the String

		for (int i = str1.length - 1; i >= 0; --i) {
			finalstr += str1[i] + " ";

		}

		// Reverse each word of the reverse String:

		String str2[] = finalstr.split(" ");
		for (int i = 0; i <= str2.length - 1; i++) {
			reverse = "";
			for (int j = str2[i].length() - 1; j >= 0; j--) {
				reverse = reverse + str2[i].charAt(j);
			}
			reverseFinalStr = reverseFinalStr + reverse + " ";

		}
		System.out.println(str + " ==== " + finalstr + " =====" + reverseFinalStr);

	}
}