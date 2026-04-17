package explore01;

import java.util.Scanner;

public class Mid2013 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		System.out.print(Z(s));
	}

	public static String Z (String s) {
		String z = "0";
		for (int i = 1; i < s.length(); i++) {
			int num = 0;
			if (s.charAt(i) != s.charAt(0))
				z += "0";
			else {
				int l = i;
				for (int j = 0; l < s.length() && s.charAt(j++) == s.charAt(l++);)
					num++; z += num; }}
		return z;
	}
}