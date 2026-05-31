import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        try {
            CalculatorInterface calc = (CalculatorInterface) Naming.lookup("rmi://localhost:1099/Calc");
            System.out.println("Client: result = " + calc.add(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
        } catch (Exception e) {
            System.out.println("Connection terminated: " + e.getMessage());
        }
    }
}