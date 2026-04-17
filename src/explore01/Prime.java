import java.util.Scanner;

public class Prime {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nubmer: "); int x = sc.nextInt();

		if (isPrime(x)) System.out.print(x+" is a prime number.");
		else System.out.print(x+" is not a prime number.");
	}

	public static boolean isPrime (int x) {
		boolean flag = true;
		for (double i = 2; i < x; i++)
			if ((x / i)%1 == 0) { flag = false; break; }
		return flag;
	}
}