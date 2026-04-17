package explore01;

import java.util.Scanner;

public class CharCount {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = sc.nextLine(); sc.close();

		System.out.println("the number of characters in this sentence is "+charCount(s)+".");
	}

	public static int charCount (String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != ' ' && !Character.isDigit(s.charAt(i)))
				count++; return count;
	}
}