package explore02;

public class Complex {
    double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() { return real; }
    public double getImaginary() { return imaginary; }
    public void add(Complex c) { real += c.real; imaginary += c.imaginary; }
    public void subtract(Complex c) { real -= c.real; imaginary -= c.imaginary;}
    public boolean equals(Complex x) { return real == x.real && imaginary == x.imaginary; }

    public String toString() {
        if (imaginary < 0) return real + " - " + -imaginary + "i";
        else return real + " + " + imaginary + "i";
    }
    public void display() {
        if (imaginary < 0) System.out.println(real + " - " + -imaginary + "i");
        else System.out.println(real + " + " + imaginary + "i");
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real+b.real, a.imaginary+b.imaginary);
    }
    public static Complex subtract(Complex a, Complex b) {
        return new Complex(a.real-b.real, a.imaginary-b.imaginary);
    }

    public static void main(String[] args) {
        Complex a = new Complex(3.9, 0.4);
        Complex b = new Complex(3.9, 0.4);
        System.out.println(a.equals(b));
        System.out.println(b.getImaginary());
        System.out.println(a.getReal());
        a.display();
        System.out.println(add(a, b));
        Complex c = subtract(b, a);
        c.add(c);
        System.out.println(c);
        b.subtract(c);
        System.out.print(b);
    }
}