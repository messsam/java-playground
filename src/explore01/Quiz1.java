package explore01;

import java.util.*;

public class Quiz1 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); String New = ""; int sum = 0;

		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' ||
				s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' ||
				s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {
					sum += s.charAt(i) - '0'; }
			else { New += "" + s.charAt(i); }}

		New = sum + New;
		System.out.print(New);
	}
}