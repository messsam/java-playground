import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        CalculatorInterface calc = new Calculator();
        Naming.rebind("rmi://0.0.0.0:1099/Calc", calc);
        System.out.println("Calculator server ready..");
    }
}