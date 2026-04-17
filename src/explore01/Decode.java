package explore01;

import java.util.Scanner;

public class Decode {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			String num = "";
			for (; Character.isDigit(s.charAt(i)); i++)
				num += s.charAt(i);
			for (int j = 1; j <= Integer.parseInt(num); j++)
				System.out.print(s.charAt(i));
		}
	}
}