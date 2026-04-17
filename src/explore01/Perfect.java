import java.util.Scanner;

public class Perfect {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();
		perfects(x);
	}

	public static int divSum (int x) {
		int divSum = 0;
		for (double i = 1; i < x; i++)
			if ((x / i)%1 == 0) divSum += i;
		return divSum;
	}
	public static boolean isPerfect (int x) {
		if (x == divSum(x)) return true; return false;
	}
	public static void perfects (int x) {
		for (int i = 1; i <= x; i++)
			if (isPerfect(i)) System.out.println(i);
	}
}