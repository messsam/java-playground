package explore01;

import java.util.Scanner;

public class Palindrome2 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: "); String w = sc.next();

		if (pali(w)) System.out.print(w+" is a palindrome.");
		else System.out.print(w+" is not a palindrome.");
	}

	public static boolean pali (String x) {
		boolean flag = true; int l = x.length()-1;
		for (int i = 0; i < x.length()/2; i++) {
			if (x.charAt(i) != x.charAt(l)) { flag = false; break; }
			l--; }
		return flag;
	}
}