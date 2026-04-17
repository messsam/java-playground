package explore03;

import java.util.Scanner;

public class DoublePyramid {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); int x = sc.nextInt();

        int space = x; int star = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int l = 1; l <= star; l++)
                System.out.print("*");
            space--; star += 2; System.out.println();
        }
        space++; star -= 2;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int l = 1; l <= star; l++)
                System.out.print("*");
            space++; star -= 2; System.out.println();
        }
    }
}