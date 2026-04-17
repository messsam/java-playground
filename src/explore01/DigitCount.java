package explore01;

import java.util.Scanner;

public class DigitCount {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in); String num;

		do { System.out.print("Please enter a number: "); num = sc.next(); int count = 0;
		for (int i = 0; i < num.length(); i++)
			count += 1; if (Integer.parseInt(num) >= 0)
				System.out.println("Number of digits in "+num+" is "+count); else
					System.out.print("Thank you!"); }
		while (Integer.parseInt(num) >= 0);
	}
}