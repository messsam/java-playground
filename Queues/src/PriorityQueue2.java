public class PriorityQueue2 {
    Comparable[] queue;
    int nOfItems;

    public PriorityQueue2(int size) { queue = new Comparable[size]; }
    public void insert(Comparable x) {
        if (!isFull()) {
            queue[nOfItems++] = x;
        }
    }
    public Comparable remove() {
        int min = 0;
        for (int i = 1; i < nOfItems; i++)
            if (queue[i].compareTo(queue[min]) < 0) min = i;
        Comparable priority = queue[min];
        queue[min] = queue[--nOfItems];
        return priority;
    }
    public int size() { return nOfItems; }
    public Comparable peek() { return queue[nOfItems-1]; }
    public boolean isEmpty() { return nOfItems == 0; }
    public boolean isFull() { return nOfItems == queue.length; }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nOfItems; i++)
            if (i == nOfItems-1) sb.append(queue[i]);
            else sb.append(queue[i]).append("\n");
        return sb.toString();
    }
}