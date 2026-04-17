package explore01;

import java.util.Scanner;

public class Rev {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); String rev = "";
		System.out.print("Enter a sentence: "); String sen = sc.nextLine();

		for (int i = sen.length()-1; i>=0; i--)
			rev += sen.charAt(i);

		System.out.print(rev);
	}
}