package VisaProgramming;

public class AdjecentMatches {

	public static void main(String args[]) {
		AdjecentMatches ob1 = new AdjecentMatches();
		System.out.println(ob1.singleOccurence("ssanngeeetaa"));

	}

	public int singleOccurence(String s) {
		StringBuffer sb = new StringBuffer(s);
		int length = s.length();
		int counter = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i; i < length && j < length - 1; j++) {
				if (sb.charAt(i) != sb.charAt(j + 1))
					i = j + 1;
				else
					counter++;

			}
		}

		return counter;
	}

}
