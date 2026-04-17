import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your base salary: LE "); double s = sc.nextDouble();
		System.out.print("Enter your experience: "); int x = sc.nextInt();

		if (x < 0) { System.out.print("YOE must be more than 0."); return; }
		else if (x <= 2) {
			System.out.println("You're not eligible for a raise yet.");
			System.out.println("Your salary with 3-5 YOE is LE "+ (s+(s*0.3)));
			System.out.println("Your salary with 6-8 YOE is LE "+ ((s+(s*0.3))+((s+(s*0.3))*0.3)));
		}
		else if (x <= 5) {
			System.out.println("Your salary with 3-5 YOE is LE "+ (s+(s*0.3)));
			System.out.println("Your salary with 6-8 YOE is LE "+ ((s+(s*0.3))+((s+(s*0.3))*0.3)));
		}
		else if (x <= 8) {
			System.out.println("Your salary with 6-8 YOE is LE "+ ((s+(s*0.3))+((s+(s*0.3))*0.3)));
		}
		System.out.print("With 9+ YOE, you're eligible for a promotion.");
	}
}