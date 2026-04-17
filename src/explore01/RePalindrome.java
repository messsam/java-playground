package explore01;

import java.util.Scanner;

public class RePalindrome {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: "); String s = sc.next();
		System.out.print(pal(s));
	}
	public static boolean pal(String s) {
		if (s.length() <= 1) return true;
		if (s.charAt(0) != s.charAt(s.length()-1)) return false;
		return pal(s.substring(1,s.length()-1));
	}
	public static boolean helper(String s, int i, int j) {
 		if (i >= j) return true;
 		if (s.charAt(i) != s.charAt(j)) return false;
 		return helper(s,i+1,j-1);
 	}
}