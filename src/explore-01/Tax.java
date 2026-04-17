import java.util.Scanner;

public class Tax {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); double tax = 0;
		System.out.print("Please enter your income: "); double inc = sc.nextDouble();

		if (inc <= 50000)
			System.out.print("No tax on your salary.");
		else if (inc <= 100000)
			tax = (inc - 50000) * 0.1;
		else if (inc <= 200000)
			tax = ((inc - 100000) * 0.2) + 5000;
		else if (inc > 200000)
			tax = ((inc - 200000) * 0.3) + 25000;

		if (inc > 50000)
			System.out.println("The tax is "+tax+", Your income after tax is: "+ (inc-tax));
	}
}