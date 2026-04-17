package dsa.queues;

public class QueueObj {
    final private Object[] queue;
    private int front = 0, rear = 0;

    public QueueObj(int maxSize) { queue = new Object[maxSize+1]; }
    public void enqueue(Object o) {
        if (!isFull()) {
            queue[rear] = o;
            rear = (rear+1)%queue.length;
        }
    }
    public Object dequeue() {
        Object res = queue[front];
        front = (front+1)%queue.length;
        return res;
    }
    public Object peek() { return queue[front]; }
    public int size() { return (rear-front+queue.length)%queue.length; }
    public boolean isEmpty() { return rear == front; }
    public boolean isFull() { return (rear+1)%queue.length == front; }
    @Override
    public String toString() {
        if (isEmpty()) return "Empty.";
        StringBuilder sb = new StringBuilder();
        for (int i = front; i != rear; i = (i + 1) % queue.length) {
            sb.append(queue[i]);
            if ((i + 1) % queue.length != rear) sb.append(", ");
        }
        return sb.toString();
    }
}