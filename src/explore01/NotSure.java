import java.util.Scanner;

public class NotSure {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); int score = 0;
		System.out.print("The employee's salary: "); int salary = sc.nextInt();
		System.out.print("Years of service: "); int service = sc.nextInt();
		System.out.print("Performance rating: "); int per = sc.nextInt();

		score += service>=5?2:1; if (per == 5 || per == 4) score += 3;
		else if (per == 3 || per == 2) score += 2;

		salary += score == 5? salary * 0.2:
			score == 4? salary * 0.1:
				score == 3? salary * 0.05:score == 2? salary * 0.02:0;
		System.out.print("The final salary after the bonus is "+salary);
	}
}