package VisaProgramming;

/*
 * Steps :

Calculate the length of the string.
Scan each every character(ch) of a string one by one
if (ch is a digit) then append it in res1 string.
else if (ch is alphabet) append in string res2.
else append in string res3.
Print the all the strings, we will have one string containing numeric part, other non numeric part and last one contain special characters.
C++JavaPython3
*/
//Time complexity of above solution is O(n) where n is the length of the string.
public class Stringplus {
	static void splitString(String str) {
		StringBuffer sepatate_Char = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special_opeattor = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				sepatate_Char.append(str.charAt(i));
			else
				sepatate_Char.append(str.charAt(i));
		}

		System.out.println(sepatate_Char);
		System.out.println(num);
		System.out.println(special_opeattor);
	}

	// Driver method
	public static void main(String args[]) {
		String str = "sangita01++--rani02amatya";
		splitString(str);
	}
}
