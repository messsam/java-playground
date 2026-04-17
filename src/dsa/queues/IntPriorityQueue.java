public class IntPriorityQueue {
    int[] queue;
    int nOfItems;

    public IntPriorityQueue(int size) { queue = new int[size]; }
    public void insert(int x) {
        if (!isFull()) {
            int i;
            for (i = nOfItems++; i > 0 && queue[i-1] < x; i--)
                queue[i] = queue[i-1];
            queue[i] = x;
        }
    }
    public int remove() { return queue[--nOfItems]; }
    public int peek() { return queue[nOfItems-1]; }
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
