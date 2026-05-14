package exceptions;

public class SuperClass {
    public void methodOne() throws RuntimeException {
        System.out.println("Original one");
        throw new RuntimeException();
    }
    public void methodTwo() throws IllegalArgumentException {
        System.out.println("Original two");
        throw new IllegalArgumentException();
    }
    public void noThrowsMethod() {
        System.out.println("Original");
    }
}