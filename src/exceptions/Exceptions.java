package exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();
        try {
            square(input);
            // arrayIndexOutOfBound();
            System.out.println("\"Rest of try code...\"");
            // System.exit(1);
        }
        catch (NullPointerException | NumberFormatException e) {
            System.out.println("Make sure all inputs are valid numbers.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You cannot access an empty array.");
        }
        finally {
            System.out.println("\"The finally block of square method...\"\n");
        }
        try {
            System.out.print(4/0);
        }
        catch (ArithmeticException e) {

        }
        finally {
            System.out.println("Hello");
        }
        System.out.println(getNumber());*/
        try {
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++)
                array[i] = Integer.parseInt(args[i]);
            System.out.print(average(array));
        }
        catch (EmptyArrayException e) {
            System.out.print("Failed execution: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public static void square(String input) throws NumberFormatException {
        System.out.println("The square of "+ input +" is: "+Math.pow(Integer.parseInt(input), 2));
    }
    public static void arrayIndexOutOfBound() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[0];
        System.out.print(arr[0]);
    }
    public static int getNumber() {
        try { return 3; }
        catch (Exception e) { return 4; }
        finally {
            System.out.println("\"The finally block of the number method...\"(Overrides the return of 3 with a return of 5)\n");
            return 5;
        }
    }
    public static double average(int[] array) {
        if (array.length == 0)
            throw new EmptyArrayException("The input array is empty.");
        double sum = 0;
        for (int index : array)
            sum += index;
        return sum / array.length;
    }
}