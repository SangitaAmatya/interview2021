package ApexAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheA {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner text = new Scanner(
				new File("/Users/adyanshpanigrahi/eclipse-workspace/Programming/src/ApexAssignment/data.txt"));
		int word = 0;
		int count = 0;
		while (text.hasNextLine()) {

			for (int i = 0; i < word.length(); i++) {
				if (word.substring(i) == "a") {
					count++;
				}
			}

		}

		System.out.print(count);
	}
}
