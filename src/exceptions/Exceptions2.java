package exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exceptions2 {
    public static void main(String[] args) {
        /* try {
            int[] intArgs = new int[args.length];
            for (int i = 0; i < args.length; i++)
                intArgs[i] = Integer.parseInt(args[i]);
            System.out.println(average(intArgs));
            upperCase("Hello");
        }
        catch (ArithmeticException e) {
            System.out.print("Error calculating the average; empty array.");
        }
        catch (NullPointerException | NumberFormatException e) {
            System.out.print(e.getMessage());
        } */
        readAndPrint("texxt.txt");
    }

    public static void upperCase(String input) {
        System.out.println(input.toUpperCase());
    }
    public static int average(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum / arr.length;
    }
    public static void readAndPrint(String path) {
        try(Scanner scanner = new Scanner(new File(path))) {
            System.out.print(scanner.nextLine());
        }
        catch (FileNotFoundException e) {
            System.out.print("Invalid path: " + e.getMessage());
        }
    }
    @Deprecated
    public static void readAndPrintDeprecated(String path) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
            System.out.println(scanner.nextLine());
        } catch (IOException e) {
            System.out.print("Invalid path to resource.");
        }
        finally {
            if (scanner != null) scanner.close();
        }
    }
    public static void checkedExceptionExample(String path) throws IOException {
        Scanner scanner = new Scanner(new File(path));
    }
}