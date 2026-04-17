package explore01;

import java.util.*;

public class Positive {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); Random r = new Random();
		int ran = r.nextInt(100) + 1; System.out.println(ran); int x;

		do {
			System.out.print("guess the number: "); x = sc.nextInt();
		}   while (x != ran); System.out.print("That's correct.");

	}
}