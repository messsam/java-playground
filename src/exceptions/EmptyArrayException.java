package exceptions;

public class EmptyArrayException extends IllegalArgumentException {
    public EmptyArrayException() { super(); }
    public EmptyArrayException(String message) { super(message); }
}