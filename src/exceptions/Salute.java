package exceptions;

import java.util.Scanner;

public class Salute {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            System.out.println("Salutations, "+name+"!");
        }
        catch (Exception e) {
            System.out.print("Exception occurred: "+e.getMessage());
        }
        finally {
            System.exit(0);
        }
        System.out.print("Rest of program...");
    }
}
