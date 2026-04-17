import java.util.*;

class Mmm {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(10)+1;
		System.out.println(ran);
		System.out.print("Guess the number: "); int x = sc.nextInt();
		while (x != ran) {
			System.out.print("You guessed wrong XD! Try again: "); x = sc.nextInt();
		}
		System.out.print("That's correct!");
	}
}