package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements CalculatorInterface {
    protected Calculator() throws RemoteException {
        super();
    }

    @Override
    public double add(double x, double y) throws RemoteException {
        System.out.println("Server: received " + x + " and " + y);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Server: computation done, returning result..");
        return x + y;
    }
}