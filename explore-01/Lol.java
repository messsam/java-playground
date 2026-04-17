import java.util.*;

public class Lol {
	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month's number: "); int x = sc.nextInt();
		String days = x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12?"31 days.":
			x==4 || x==6 || x==9 || x==11?"30 days.":
				x==2?"28 days.":"Error.";
		System.out.print(days);
	}
}