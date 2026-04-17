import java.util.Scanner;

class Factorial {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int fact = 1;
		System.out.print("Enter a number: "); int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			fact *= i;
		}   System.out.print("The factorial of "+x+" is: "+fact);
	}
}