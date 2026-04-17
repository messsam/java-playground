package explore01;

import java.util.*;
public class Dice {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int accumulated = 0, accumulatedPC = 0;
		char flag;
		do {
			System.out.println("You're rolling the dice");
			int roll1 = r.nextInt(6)+1, roll2 = r.nextInt(6)+1;
			if (roll1 == 1 && roll2 == 1)
				accumulated = 0;
			else if (roll1 == 1 || roll2 == 1)
				accumulated -= (roll1+roll2);
			else accumulated += (roll1+roll2);
			if (accumulated >= 100) {
				System.out.print("You won!"); break; }
			System.out.println("You rolled "+roll1+" "+roll2);
			System.out.println("Total: "+(roll1+roll2)+"\nGrand total: "+accumulated);
			int roll3 = r.nextInt(6)+1, roll4 = r.nextInt(6)+1;
			if (roll3 == 1 && roll4 == 1)
				accumulatedPC = 0;
			else if (roll3 == 1 || roll4 == 1)
				accumulatedPC -= (roll3+roll4);
			else accumulatedPC += (roll3+roll4);
			if (accumulatedPC >= 100) {
				System.out.print("PC won!"); break; }
			System.out.println("The computer has total of: "+accumulatedPC);
			System.out.print("Wanna continue? "); flag = sc.next().charAt(0); }
		while (flag == 'y' || flag == 'Y');
		if (accumulated < 100 && accumulatedPC < 100) {
			if (accumulated > accumulatedPC)
				System.out.print("You won!");
			else if (accumulatedPC > accumulated)
				System.out.print("PC won!");
			else System.out.print("Draw."); }
	}
}