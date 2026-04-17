package explore01;

import java.util.Scanner;

public class Counter2 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: "); String word = sc.nextLine();
		System.out.print("Enter a character: "); char c = sc.next().charAt(0);
		System.out.print("The character "+c+" occurs "+count(word, c)+" times in ( "+word+" )");
	}

	public static int count (String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (c == s.charAt(i)) count ++;
		return count;
	}
}