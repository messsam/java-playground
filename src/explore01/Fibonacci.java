package explore01;

import java.util.Scanner;

public class Fibonacci {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();

		if (x < 0) System.out.print("Error.");
		else if (x == 0) System.out.print("The 0th Fibonacci number is: 0");
		else if (x == 1) System.out.print("The 1st Fibonacci number is: 1");
		else if (x == 2) System.out.print("The 2nd Fibonacci number is: 1");
		else if (x == 3) System.out.print("The 3rd Fibonacci number is: 2");
		else System.out.print("The "+x+"th Fibonacci number is: "+ fib(x));
	}

	public static int fib (int x) {
		int fib = 0, fib0 = 0, fib1 = 1;
		for (int i = 2; i <= x; i++) { fib = fib0 + fib1; fib0 = fib1; fib1 = fib; }
		return fib;
	}
}