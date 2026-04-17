package explore01;

import java.util.Scanner;

public class Occurrences {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int count = 0;
		System.out.print("Enter a sentence: "); String s = sc.nextLine();
		System.out.print("Enter a word: "); String w = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			int r = i; boolean flag = true;
			for (int l = 0; l < w.length(); l++) {
				if (w.charAt(l) != s.charAt(r)) { flag = false; break; } r++; }
			if (flag == true) count++; }

		System.out.print("The word ( "+w+" ) occurs "+count+" times in the sentence.");
	}
}