package explore03;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: "); int x = sc.nextInt();
		System.out.print(cube(x));
	}

	public static int square(int x) {
		if (x == 0) return 0;
		return ((2*x)-1) + square(x-1);
	}

	public static int cube(int x) {
		if (x == 0) return 0;
		return cube(x-1) + 3*square(x) - (3*x)+1;
	}
}