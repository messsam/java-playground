package headfirstjava;

public class Shape {
    void rotate() {}
    void playSound() {}

    static class Square extends Shape {}
    static class Circle extends Shape {}
    static class Triangle extends Shape {}
    static class Amoeba extends Shape {
        Point p;
        Amoeba(Point p) {
            this.p = p;
        }
    }
    static class Point {
        double x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void rotate() {}
        void playSound() {}
        @Override
        public String toString() {
            return "("+x+", "+y+")";
        }
    }
    public static void main(String[] args) {
        Amoeba m = new Amoeba(new Point(34, 66));
        System.out.print(m.p);
    }
}