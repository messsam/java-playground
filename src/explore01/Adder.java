package explore01;

import java.util.Scanner;

public class Adder {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int var = 0; int y;
		System.out.print("How many integers will be added? "); int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print("Enter integer "+i+": "); y = sc.nextInt();
			var += y;
		}   System.out.print("The sum is "+var+'.');
	}
}