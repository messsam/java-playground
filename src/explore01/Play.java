package explore01;

import java.util.*;

class Play {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: "); int x = sc.nextInt();
		System.out.print("Enter the second number: "); int y = sc.nextInt();
		System.out.print("Enter the required operation: "); char o = sc.next().charAt(0);

		if (o=='A' || o=='a' || o=='+')
			System.out.print(x+y);
		else if (o=='S' || o=='s' || o=='-')
			System.out.print(x-y);
		else if (o=='M' || o=='m' || o=='*')
			System.out.print(x*y);
		else if (o=='D' || o=='d' || o=='/')
			System.out.print(x/y);
		else if (o=='R' || o=='r' || o=='%')
			System.out.print(x%y);
		else
			System.out.print("Error.");
	}
}