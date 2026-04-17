package explore01;

import java.util.*;

public class Six {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int count = 1; int ran1; int ran2;
		do {
			ran1 = (int) (Math.random()*6) + 1;
			ran2 = (int) (Math.random()*6) + 1;
			if (ran1 != 1 && ran2 != 1)
				count++;
		}
		while (ran1 != 1 && ran2 != 1); System.out.print("It took "+count+" rolls to get snake eyes.");
	}
}