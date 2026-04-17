package explore01;

import java.util.Scanner;

public class Extractor {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		System.out.println("The numbers contained in your string are");

		for (int i = 0; i < s.length(); i++) {
			String number = "";
			for (;i < s.length() && Character.isDigit(s.charAt(i)); i++)
				number += s.charAt(i); if (!number.isEmpty())
				System.out.println(number);
		}
	}
}