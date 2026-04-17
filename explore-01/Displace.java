import java.util.Scanner;

public class Displace {
	public static void main (String RGS []) {

		Scanner sc = new Scanner(System.in); String msg = "";
		System.out.print("Enter a message: "); String message = sc.nextLine();
		System.out.print("Enter the key: "); int key = sc.nextInt();

		for (int i = 0; i < message.length(); i++) {
			msg += (char) (message.charAt(i)+key);
		} System.out.print(msg);
	}
}