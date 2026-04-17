package explore01;

import java.util.Scanner;

public class haveYouFinishedStudying {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		String ans;

		do {
			System.out.print("Have you finished studying? ");
			ans = sc.next(); ans = ans.toLowerCase();

			if (ans.equals("yes")) System.out.print("Good job! :D");
			else if (ans.equals("no")) System.out.print("Then finish it you fuckhead.");
			else System.out.println("This isn't how we answer a Yes/No question you stupid fucking ape"); }
		while (!ans.equals("yes") && !ans.equals("no"));
	}
}