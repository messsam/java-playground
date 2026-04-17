package explore01;

import java.util.Scanner;

public class Quiz1two {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		String neu = ""; String number = ""; int num = 0; int n = 0;

		for (int i = s.length()-2; i >= 0; i--) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' ||
				s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' ||
				s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' ||
				s.charAt(i) == '9')
					number += s.charAt(i);
			else neu += s.charAt(i); }
		num = Integer.parseInt(number);
		for (; num > 0; num /= 10)
			n += num % 10;
		System.out.print(n + neu);
	}
}