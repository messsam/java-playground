import java.util.Scanner;

public class Lap3 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the age: "); double age = sc.nextDouble();

		if (age<=0)
			System.out.print("Age cannot be negative or zero!");
		else if (age<13)
			System.out.print("This person classifies as a child.");
		else if (age<20)
			System.out.print("This person classifies as a teenager.");
		else {
			System.out.print("Are you employed?: "); char answer = sc.next().charAt(0);
			if (age<60 && answer=='y' || answer=='Y')
				System.out.print("This person classifies as an employed adult.");
			else if (age<60 && answer=='n' || answer=='N')
				System.out.print("This person classifies as an unemployed adult.");
			else if (age>=60 && answer=='y' || answer=='Y')
				System.out.print("This person classifies as an employed senior citizen adult.");
			else if (age>=60 && answer=='n' || answer=='N')
				System.out.print("This person classifies as an unemployed senior citizen adult.");
			else System.out.print("Error.");
		}
	}
}