package rmi;

import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        double first, second;

        if (args.length == 2) {
            first = Double.parseDouble(args[0]);
            second = Double.parseDouble(args[1]);
        } else {
            System.out.println("Input arguments were not give or misformatted; the numbers will be randomly assigned.");
            first = Math.random() * 100;
            second = Math.random() * 100;
        }

        try {
            CalculatorInterface calc = (CalculatorInterface) Naming.lookup("rmi://localhost:1099/Calc");
            System.out.println("Client: result = " + calc.add(first, second));
        } catch (Exception e) {
            System.out.println("Connection terminated: " + e.getMessage());
        }
    }
}