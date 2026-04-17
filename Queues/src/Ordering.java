public class Ordering {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(-1); q.enqueue(4);
        q.enqueue(1); q.enqueue(2);
        q.enqueue(10);
        IO.print(smallest(q, 3));
    }
    public static int smallest(Queue q, int n) {
        int[] arr = new int[q.size()];
        for (int i = 0; i < q.size(); i++) {
            arr[i] = (Integer) q.peek();
            q.enqueue(q.dequeue());
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j;
            for (j = i; j > 0 && arr[j-1] > temp; j--)
                arr[j] = arr[j-1];
            arr[j] = temp;
        }
        return arr[n];
    }
}