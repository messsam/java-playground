import java.util.*;

public class Two {
	public static void main (String args []) {

		Random r = new Random(); int ranPin = r.nextInt(10000-1000)+1000; //([upper+1]-lower)+lower.
		System.out.println(ranPin);
		Scanner sc = new Scanner(System.in); int i = 2;
		System.out.print("Insert your PIN code: "); int pin = sc.nextInt();

		if (pin == ranPin)
			System.out.print("Correct.");
		else {
			for (;i<=3; i++) {
				System.out.print("Incorrect. Please isnert your PIN code again: "); pin = sc.nextInt();
				if (pin == ranPin) {
					System.out.print("Correct. You entered it correctly at trial "+i); break;
				}
			}
		} if (i>3) {
			System.out.print("You've exceded your 3 trials.");
		}
	}
}