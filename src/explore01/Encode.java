package explore01;

import java.util.Scanner;

public class Encode {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine(); String encode = "";

		for (int i = 0; i < s.length(); i++) {
			if (occurs(s.charAt(i), encode) == false)
				encode += "" + s.charAt(i) + occurrences(s.charAt(i), s); }
		System.out.print(encode);
	}

	public static int occurrences (char x, String y) {
		int occurrences = 0;
		for (int i = 0; i < y.length(); i++)
			if (x == y.charAt(i))
				occurrences += 1;
		return occurrences;
	}

	public static boolean occurs (char x, String y) {
		if (occurrences(x, y) > 0)
			return true; return false;
	}
}