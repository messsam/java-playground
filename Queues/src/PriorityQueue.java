public class PriorityQueue {
    Comparable[] queue;
    int nOfItems;

    public PriorityQueue(int size) { queue = new Comparable[size]; }
    public void insert(Comparable o) {
        if (!isFull()) {
            int i;
            for (i = nOfItems++; i > 0 && o.compareTo(queue[i-1]) > 0; i--)
                queue[i] = queue[i-1];
            queue[i] = o;
        }
    }
    public int size() { return nOfItems; }
    public Comparable remove() { return queue[--nOfItems]; }
    public Comparable peek() { return queue[nOfItems-1]; }
    public boolean isEmpty() { return nOfItems == 0; }
    public boolean isFull() { return nOfItems == queue.length; }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = nOfItems-1; i >= 0; i--)
            if (i == 0) sb.append(queue[i]);
            else sb.append(queue[i]).append(", ");
        return sb.toString();
    }
}