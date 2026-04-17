import java.util.*;

public class Pyramid {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int n = sc.nextInt(); int half = n / 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= half; j++)
				System.out.print(" "); half--;
			for (int r = 1; r <= i; r++)
				System.out.print(r); i++;
			System.out.println();
		}
	}
}