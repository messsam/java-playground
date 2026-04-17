public class Queue {
    final private Object[] queue;
    private int noOfObjects = 0, front = 0, rear = -1;

    public Queue(int size) { queue = new Object[size]; }
    public void enqueue(Object o) {
        if (!isFull()) {
            rear = (rear+1)%queue.length;
            queue[rear] = o;
            noOfObjects++;
        }
    }
    public Object dequeue() {
        Object res = queue[front];
        front = (front+1)%queue.length;
        noOfObjects--;
        return res;
    }
    public Object peek() { return queue[front]; }
    public int size() { return noOfObjects; }
    public boolean isEmpty() { return noOfObjects == 0; }
    public boolean isFull() { return noOfObjects == queue.length; }
    @Override
    public String toString() {
        if (isEmpty()) return "Empty.";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < noOfObjects; i++) {
            int current = (front+i)%queue.length;
            if (current == rear) sb.append(queue[current]);
            else sb.append(queue[current]).append(", ");
        }
        return sb.toString();
    }
    public Object getIndex(int index) {
        return queue[(front+index)%queue.length];
    }
    public void reverse() {
        for (int i = front, j = rear; i < size()/2; i = (i+1)%queue.length, j = ((j-1)+queue.length)%queue.length) {
            Object temp = queue[i];
            queue[i] = queue[j];
            queue[j] = temp;
        }
    }
}