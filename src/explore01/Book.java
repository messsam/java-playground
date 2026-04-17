package explore01;

import java.util.Scanner;

public class Book {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the initial word: "); String x = sc.nextLine();
		System.out.print("Enter the last word: "); String y = sc.nextLine();

	    for (int i = x.length() + y.length(); i < 30; i++) { x += "."; }
	    x += y; System.out.println(x); System.out.print(x.length());
	}
}