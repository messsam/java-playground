package explore01;

import java.util.Scanner;

public class Encode2 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: "); String s = sc.nextLine();
		System.out.print(encode(s));
	}
	public static String encode(String s) {
		String encode = "";
		for (int i = 0; i < s.length(); i++)
			if (occur(s.charAt(i), encode) == 0)
				encode += "" + occur(s.charAt(i), s) + s.charAt(i);
		return encode;
	}
	public static int occur(char c, String s) {
		int occur = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				occur++;
		return occur;
	}
}