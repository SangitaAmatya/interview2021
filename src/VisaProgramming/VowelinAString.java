package VisaProgramming;

import java.util.Scanner;

public class VowelinAString {
	/*
	 * 1. Read a sentence from the user 2. Create a variable (count) initialize it
	 * with 0; 3. Compare each character in the sentence with the characters {'a',
	 * 'e', 'i', 'o', 'u' } 4. If a match occurs increment the count. 5. Finally
	 * print count.
	 */

	public static void main(String args[]) {
		int count = 0;
		int consonants = 0;
		System.out.println("Enter a sentence :");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
				count++;
			} else {
				consonants++;
			}
		}
		System.out
				.println("Number of vowels  and consonant in the given sentence is " + " " + count + " " + consonants);
	}
}
