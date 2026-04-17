import java.util.Scanner;

class Timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time count = new Time();
        System.out.print("Enter the hours: "); int h = sc.nextInt();
        System.out.print("Enter the minutes: "); int m = sc.nextInt();
        System.out.print("Enter the seconds: "); int s = sc.nextInt();

        do {
            count.addSecs(1);
            System.out.println(count);
        } while(count.seconds != s || count.minutes != m || count.hours != h);

        System.out.print("Enter the time (H:M:S): ");
        Time t = new Time(sc.next());
        t.addHrs(1);
        System.out.print(t);
        sc.close();
    }
}