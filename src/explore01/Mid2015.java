package explore01;

import java.util.Scanner;

public class Mid2015 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();
		System.out.print(presistance(x));
	}
	public static int product (int x) {
		int product = 1;
		for (; x > 0; x /= 10)
			product *= x%10;
		return product;
	}
	public static int presistance (int x) {
		int presistance = 0;
		for (; x > 9; presistance++)
			x = product(x);
		return presistance;
	}
}