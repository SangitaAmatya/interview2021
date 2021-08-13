package VisaProgramming;

public class ReverseAstring {
	/*
	 * Write a java program to reverse a sentence Input string = “ This is my car” 
	 * Output: car my is this  rac ym si siht  racy ms is iht 
	 */
	public static void main(String[] args) {
		String input = "This is my car";

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
