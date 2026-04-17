package explore01;

import java.util.*;

public class Lap4 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius: "); int cels = sc.nextInt();
		double fahr = (1.8 * cels) + 32; System.out.print(fahr);
	}
}