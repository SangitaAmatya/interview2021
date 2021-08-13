package VisaProgramming;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1 = "angered ";
		String s2 = "enrageD";

		if (anagramcheck(s1, s2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not anagrams");
		}
	}

	}

	// write a method function
static boolean anagramcheck(String s1,String s2) {
	//check the  2 string are in the same length
	if(s1.length()!=s2.length()) {
		

	return false;
//Transform the two string to array og chars
	 s1 = s1.toLowerCase().replace(" ", "");
     s2 = s2.toLowerCase().replace(" ", "");

     // checking length
     if (s1.length() != s2.length()) {
         return false;
     }

     // transform to arrays to char
     char string1ToArray[] = s1.toCharArray();
     char string2ToArray[] = s2.toCharArray();

     // sorting
     Arrays.sort(string1ToArray);
     Arrays.sort(string2ToArray);

     for (int i = 0; i < s1.length(); i++) {
         if (string1ToArray[i] != string2ToArray[i]) {
             return false;
         }
     }
     return true;
 }
}