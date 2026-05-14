package exceptions;

import java.io.IOException;

public class SubClass extends SuperClass {
    @Override public void methodOne() throws RuntimeException {
        System.out.println("Sub one");
    }
    @Override public void methodTwo() throws ArithmeticException {
        System.out.println("Sub two");
    }
    @Override public void noThrowsMethod() throws RuntimeException {
        System.out.print("Sub");
    }
}