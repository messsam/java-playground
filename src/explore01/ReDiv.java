package explore01;

import java.util.Scanner;

public class ReDiv {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();
		System.out.print("Enter another number: "); int y = sc.nextInt();
		if (x < 0) System.out.print(-ReDiv(-x,y));
		else if (y < 0) System.out.print(-ReDiv(x,-y));
		else System.out.print(ReDiv(x,y));
	}
	public static int ReDiv(int x, int y) {
		if (x < y || y == 0) return 0;
		return 1 + ReDiv(x-y, y);
	}
}