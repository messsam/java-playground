package dsa.queues;

class Point2D implements Comparable {
    int x, y;
    public Point2D(int x, int y) {
        this.x = x; this.y = y;
    }
    @Override
    public int compareTo(Object o) {
        Point2D other = (Point2D) o;
        double here = Math.sqrt((x*x)+(y*y));
        double there = Math.sqrt((other.x*other.x)+(other.y*other.y));
        if (here > there) return 1;
        else if (here < there) return -1;
        else if (x != other.x) return x - other.x;
        else return y - other.y;
    }
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue(3);
        PQ.insert(new Point2D(3, 4));
        PQ.insert(new Point2D(1, 2));
        PQ.insert(new Point2D(0, 5));
        while (!PQ.isEmpty())
        System.out.print(PQ.remove()+", ");
    }
}
