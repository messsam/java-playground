import java.util.Scanner;

public class Lap2 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of hours taken: "); double hrs = sc.nextDouble();
		System.out.print("Enter the task tybe: "); String tybe = sc.next();

		if (hrs<=0)
			System.out.print("Invalid number of hours.");
		else if (tybe.equals("academic")) {
			String res = hrs<=2?"Outstanding.":(hrs<=3?"Highly efficient.":(hrs<=4?"Needs improvement.":"Termination."));
			System.out.print(res); }
		else if (tybe.equals("admin")) {
			String res = hrs<=3?"Outstanding.":(hrs<=4?"Highly efficient.":(hrs<=5?"Needs improvement.":"Termination."));
			System.out.print(res); }
		else System.out.print("Error.");
	}
}