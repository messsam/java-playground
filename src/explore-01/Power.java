import java.util.Scanner;

public class Power {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int n = sc.nextInt();
		System.out.print("Enter its exponent: "); int x = sc.nextInt();
		System.out.print("The number "+n+" to the power of "+x+" is "+power(n,x));
	}

	public static int power (int x, int y) {
		int xx = x;
		for (int i = 2; i <= y; i++)
			x *= xx; return x; }
	public static double power (double x, double y) {
		double xx = x;
		for (int i = 2; i <= y; i++)
			x *= xx; return x; }
}