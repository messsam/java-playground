public class L05 {
    public static void main(String[] args) {
        IO.print(anagrams("hlol", "olelh"));
    }
    static Object getIndex(int index, Queue queue) {
        Object element = null;
        for (int i = 0; i < queue.size(); i++) {
            if (i == index) element = queue.peek();
            queue.enqueue(queue.dequeue());
        }
        return element;
    }
    static void reverseQueue(Queue q) {
        Stack rev = new Stack(q.size());
        while (!q.isEmpty())
            rev.push(q.dequeue());
        while (!rev.isEmpty())
            q.enqueue(rev.pop());
    }
    static void reverseQueue2(Queue q) {
        for (int i = 0; i < q.size(); i++) {
            Object current = q.dequeue();
            for (int j = 0; j < q.size()-i; j++)
                q.enqueue(q.dequeue());
            q.enqueue(current);
            for (int j = 0; j < i; j++)
                q.enqueue(q.dequeue());
        }
    }
    public static Queue reverseQueue3(Queue q) {
        Queue reverse = new Queue(q.size());
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < q.size()-1; j++)
                q.enqueue(q.dequeue());
            reverse.enqueue(q.peek());
        }
        return reverse;
    }
    static void reverseQueueRec(Queue q) {
        if (q.size() == 1) return;
        Object current = q.dequeue();
        reverseQueueRec(q);
        q.enqueue(current);
    }
    static Queue reverseQueueRec2(Queue q) {
        if (q.size() == 1) return q;
        Object temp = q.dequeue();
        q = reverseQueueRec2(q);
        q.enqueue(temp);
        return q;
    }
    static int unableToEat(Queue sts, Stack sws) {
        for (int counter = 0; counter < sts.size(); counter++) {
            if (sts.peek() == sws.peek()) {
                sts.dequeue(); sws.pop();
                counter = -1; continue;
            }
            sts.enqueue(sts.dequeue());
        }
        return sts.size();
    }
    static void insertElementsAtFront(Queue first, Queue second) {
        int len = first.size() > second.size()? second.size(): first.size();
        for (int i = 0; i < first.size()-len; i++)
            first.enqueue(first.dequeue());
        for (int i = 0; i < len; i++) {
            first.dequeue(); first.enqueue(second.peek());
            second.enqueue(second.dequeue());
        }
        for (int i = 0; i < first.size()-len; i++)
            first.enqueue(first.dequeue());
        for (int i = 0; i < second.size()-len; i++)
            second.enqueue(second.dequeue());
    }
    static Queue thirdRev(Queue q) {
        Queue res = new Queue(q.size());
        Stack temp = new Stack(q.size());
        while (!q.isEmpty())
            temp.push(q.dequeue());
        for (int i = 0; !temp.isEmpty(); i++)
            if (i%3 == 0) res.enqueue(temp.pop());
            else temp.pop();
        return res;
    }
    public static Queue mirror(Queue q) {
        Queue res = new Queue(q.size()*2);
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < q.size()-1; j++)
                q.enqueue(q.dequeue());
            res.enqueue(q.peek());
        }
        while (!q.isEmpty())
            res.enqueue(q.dequeue());
        return res;
    }
    public static void interleave(Queue q) {
        int half = q.size()/2;
        Stack st = new Stack(half);
        for (int i = 0; i < half; i++)
            st.push(q.dequeue());
        helper(q, st);
        q.enqueue(st.pop());
    }
    public static void helper(Queue q, Stack st) {
        if (q.size() == 1) return;
        int current = (int) q.dequeue();
        helper(q, st);
        q.enqueue(st.pop());
        q.enqueue(current);
    }
    static void hello () {
        IO.print("hello people!");
    }
    static boolean anagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Queue one = new Queue(s1.length());
        Queue two = new Queue(s2.length());
        for (int i = 0; i < s1.length(); i++) {
            one.enqueue(s1.charAt(i));
            two.enqueue(s2.charAt(i));
        }
        int counter = one.size();
        while (counter > 0) {
            if (one.peek() == two.peek()) {
                one.dequeue(); two.dequeue();
                counter = one.size();
            }
            else {
                one.enqueue(one.dequeue());
                counter--;
            }
        }
        return one.isEmpty();
    }
}
