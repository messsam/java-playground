import java.util.Scanner;

class LapQ {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start day of the week: "); String y = sc.nextLine();
		System.out.print("Enter the day number: "); int x = sc.nextInt();
		y = y.toLowerCase();

		if (y.equals("saturday")) {
			switch(x) {
				case 1: System.out.print("Saturday."); break;
				case 2: System.out.print("Sunday."); break;
				case 3: System.out.print("Monday."); break;
				case 4: System.out.print("Thursday."); break;
				case 5: System.out.print("Wednesday."); break;
				case 6: System.out.print("Tuesday."); break;
				case 7: System.out.print("Friday."); break;
				default: System.out.print("Error."); }
		} else if (y.equals("monday")) {
			switch(x) {
				case 1: System.out.print("Monday."); break;
				case 2: System.out.print("Thursday."); break;
				case 3: System.out.print("Wednesday."); break;
				case 4: System.out.print("Tuesday."); break;
				case 5: System.out.print("Friday."); break;
				case 6: System.out.print("Saturday."); break;
				case 7: System.out.print("Sunday."); break;
				default: System.out.print("Error."); }
		}
	}
}