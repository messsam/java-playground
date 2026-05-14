package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void main() throws FileNotFoundException {
        var reader = new FileReader("text.txt");
    }
}
