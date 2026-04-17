package explore01;

import java.util.Scanner;

public class Counter {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int count = 0;
		System.out.print("Enter a sentence: "); String word = sc.nextLine();
		System.out.print("Enter a character: "); char c = sc.next().charAt(0);

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == c)
				count++; }

		System.out.print("The character ( "+c+" ) occurs "+count+" times in this sentence.");
	}
}