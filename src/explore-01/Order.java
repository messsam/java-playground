import java.util.Scanner;

public class Order {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word: "); String word1 = sc.next();
		System.out.print("Enter the second word: "); String word2 = sc.next();
		System.out.println();

		if (word1.compareTo(word2) < 0) System.out.print(word1+" occurs before "+word2);
		else System.out.print(word2+" occurs before "+word1);
	}
}