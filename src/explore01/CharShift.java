package explore01;

import java.util.Scanner;

public class CharShift {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String message = sc.nextLine();
		System.out.print("Enter a key: "); int key = sc.nextInt();
		sc.close(); String neu = "";

		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i)+key > 'Z' && message.charAt(i)+key < 'a')
				neu += (char) ((message.charAt(i)+key - 'Z') + 64);
			else if (message.charAt(i)+key > 'z')
				neu += (char) ((message.charAt(i)+key - 'z') + 96);
			else neu += (char) (message.charAt(i)+key); }

		System.out.print(neu);
	}
}