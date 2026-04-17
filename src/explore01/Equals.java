package explore01;

import java.util.*;

public class Equals {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int i = 0;
		System.out.print("Enter the first string: "); String one = sc.nextLine();
		System.out.print("Enter the second string: "); String two = sc.nextLine();

		if (one.length() != two.length())
			System.out.print("Not equal.");
		else {
			for (; i < one.length(); i++) {
				if (one.charAt(i) != two.charAt(i)) {
					System.out.print("Not equal."); break;
				}
			}
		} if (i == one.length())
			System.out.print("The sentences are equal.");
	}
}