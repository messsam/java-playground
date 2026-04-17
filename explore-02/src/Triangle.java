public class Triangle {
    // Variables.
    Point vertexOne, vertexTwo, vertexThree;
    static int count;
    // Constructors.
    public Triangle() { this(new Point(), new Point(), new Point()); }
    public Triangle(Point p1, Point p2, Point p3) {
        vertexOne = p1; vertexTwo = p2; vertexThree = p3;
        count++;
    }
    // instance methods.
    public void rotate() { vertexOne.swap(vertexTwo); vertexOne.swap(vertexThree); }
    public String toString() { return vertexOne + ", " + vertexTwo + ", " + vertexThree; }
    public Triangle copy() {return new Triangle(new Point(vertexOne.x, vertexOne.y), new Point(vertexTwo.x, vertexTwo.y), new Point(vertexThree.x, vertexThree.y)); }
}
