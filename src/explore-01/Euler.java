import java.util.Scanner;

public class Euler {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();

		System.out.print(euler(x));
	}

	public static int factorial (int x) {
		int fact = 1;
		for (int i = 1; i <= x; i++)
			fact *= i; return fact;
	}

	public static double euler (int x) {
		double euler = 0;
		for (int i = 0; i <= x; i++)
			euler += 1.0/factorial(i); return euler;
	}
}