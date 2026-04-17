package explore01;

import java.util.Scanner;

public class Mid2018 {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine(); sc.close();

		System.out.print(translate(s));
	}
	public static int getNumber(char c) {
		switch(c) {
			case '+': return 0;
			case 'a': case 'b': case 'c': return 2;
			case 'd': case 'e': case 'f': return 3;
			case 'g': case 'h': case 'i': return 4;
			case 'j': case 'k': case 'l': return 5;
			case 'm': case 'n': case 'o': return 6;
			case 'p': case 'q': case 'r': case 's': return 7;
			case 't': case 'u': case 'v': return 8;
			case 'w': case 'x': case 'y': case 'z': return 9;
			default: return 1; }
	}
	public static String translate(String s) {
			String translate = ""; s = s.toLowerCase();

			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i)))
					translate += s.charAt(i);
				else
					translate += getNumber(s.charAt(i)); }
			return translate;
	}
}