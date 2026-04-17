import java.util.*;

public class Elec {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); double bill = 0;
		System.out.print("Enter the amount of consumed units: "); double units = sc.nextDouble();

		if (units < 0) {
			System.out.println();
			System.out.print("Invalid input!"); }
		else if (units <= 100)
			bill += units * 0.5;
		else if (units <= 300)
			bill += units* 0.75;
		else if (units <= 500)
			bill += units;
		else {
			System.out.print("Enter the electricity unit rate: "); double rate = sc.nextDouble();
			bill += units * rate;
		}   System.out.println();

		if (units >= 0)
		System.out.print("Total bill is: " + bill);
	}
}