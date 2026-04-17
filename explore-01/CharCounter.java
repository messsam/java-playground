import java.util.Scanner;

public class CharCounter {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); String y = "";
		System.out.print("Enter a string: "); String x = sc.nextLine();

		for (int i = 0; i < x.length(); i++) {
			int counter = 0;

			for (int j = 0; j < x.length(); j++)
				if (x.charAt(j) == x.charAt(i))
					counter++;
			y += "" + x.charAt(i) + counter; }

		System.out.print(y);
	}
}