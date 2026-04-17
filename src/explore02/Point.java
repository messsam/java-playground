public class Point {

    double x, y;
    static int count; //Class variable.

    public Point() { count++; }
    public Point(double x) { this(x, 0); }
    public Point(double x, double y) { this.x = x; this.y = y; count++; }

    // Dynamic/Instance methods.
    public String toString() {
        if (x%1 == 0 && y%1 == 0) return "(" + (int) x + ", " + (int) y + ")";
        if (x%1 == 0) return "(" + (int) x + ", " + y + ")";
        if (y%1 == 0) return "(" + x + ", " + (int) y + ")";
        return "(" + x + ", " + y + ")";
    }
    public void move(double dx, double dy) { x += dx; y += dy; }
    public void add(Point b) { x += b.x; y += b.y; }
    public void swap(Point b) {
        double x = this.x, y = this.y;
        this.x = b.x; this.y = b.y;
        b.x = x; b.y = y;
    }

    // Static/class methods.
    public static Point add(Point a, Point b) { return new Point(a.x+b.x, a.y+b.y); }
    public static void swap(Point a, Point b) {
        double x = a.x, y = a.y;
        a.x = b.x; a.y = b.y;
        b.x = x; b.y = y;
    }
    public static Point move(Point p, int dx, int dy) {
        return new Point(p.x+dx, p.y+dy);
    }
}