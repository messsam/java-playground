import java.util.Scanner;

public class Plaindrome {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: "); String word = sc.next();
		int last = word.length() - 1; int s = word.length() - 1; int i = 0;

		for (; i <= (int)(s/2); i++) {
			if (word.charAt(i) != word.charAt(last)) {
				System.out.print("Not a palindrome."); break;
			}   last--;
		} if (i > (int)(s/2))
			System.out.print("It's a palindrome.");
	}
}