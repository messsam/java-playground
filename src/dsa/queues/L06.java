package dsa.queues;

import dsa.stacks.Stack;

public class L06 {
    static void main(String[] args) {
        /*PriorityQueue uni = new PriorityQueue(5);
        uni.insert(new University("AUC", 1));
        uni.insert(new University("BUE", 5));
        uni.insert(new University("CU", 4));
        uni.insert(new University("GUC", 1));
        uni.insert(new University("BUC", 5));
        System.out.println(uni+"\n");
        IO.println(uni.remove());
        uni.insert(new University("GIU", 3));
        IO.print("\n"+uni);
        EmergencyRoom er = new EmergencyRoom(1, 6);
        er.newPatient("Mohand", 2);
        er.newPatient("Magdy", 4);
        er.newPatient("Ahmed", 3);
        er.newPatient("Negm", 2);
        er.newPatient("Momen", 5);
        er.newPatient("Retaj", 1);
        IO.println(er+"\n");
        IO.println(er.nextPatient());
        IO.println(er.nextPatient()+"\n");
        er.newPatient("Mariam", 2);
        IO.print(er);
        Queue q = new Queue(7);
        q.enqueue(1); q.enqueue(2);
        q.enqueue(4); q.enqueue(3);
        q.enqueue(5); q.enqueue(10);
        System.out.println(check(q));
        System.out.print(q);
        Queue q = new Queue(10);

        q.enqueue(5); q.enqueue(0);
        q.enqueue(1); q.enqueue(4);
        q.enqueue(3); q.enqueue(0);
        q.enqueue(0); q.enqueue(6);
        q.enqueue(1); q.enqueue(0);
        shiftTheZeros(q);
        System.out.println(q);*/
        Queue q = new Queue(4);
        q.enqueue(5); q.enqueue(1); q.enqueue(1); q.enqueue(1);
        IO.print(timeTaken(q, 0));
    }
    public static boolean check(Queue q) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            if (i%2 == 0) sum += (int) q.peek();
            q.enqueue(q.dequeue());
        }
        boolean flag = false;
        for (int i = 0; i < q.size(); i++) {
            if (sum == (int) q.peek()) flag = true;
            q.enqueue(q.dequeue());
        }
        return flag;
    }
    public static void shift(Queue q, int n) {
        int len = n < 0? -n: q.size()-n, i;
        for (i = 0; i < len; i++)
            q.enqueue(q.dequeue());
        for (; i < q.size(); i++) {
            q.dequeue(); q.enqueue(0);
        }
    }
    public static int extractSt(Stack st, int n) {
        Stack temp = new Stack(n);
        for (int i = 0; i < n-1; i++)
            temp.push(st.pop());
        int res = (int) st.pop();
        while (!temp.isEmpty())
            st.push(temp.pop());
        return res;
    }
    public static int extractQ(Queue q, int n) {
        int size = q.size();
        for (int i = 0; i < n-1; i++)
            q.enqueue(q.dequeue());
        int res = (int) q.dequeue();
        for (int i = 0; i < size-n; i++)
            q.enqueue(q.dequeue());
        return res;
    }
    public static void reverse(Queue q) {
        for (int i = 0; i < q.size(); i++) {
            Object current = q.dequeue();
            for (int j = 0; j < q.size()-i; j++)
                q.enqueue(q.dequeue());
            q.enqueue(current);
            for (int j = 0; j < i; j++)
                q.enqueue(q.dequeue());
        }
    }
    public static Queue rev(Queue q) {
        Queue neu = new Queue(q.size());
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < q.size() -1; j++)
                q.enqueue(q.dequeue());
            neu.enqueue(q.peek());
        }
        return neu;
    }
    public static Queue mirror(Queue q) {
        Queue mirror = new Queue(q.size()*2);
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < q.size()-1; j++)
                q.enqueue(q.dequeue());
            mirror.enqueue(q.peek());
        }
        while (!q.isEmpty())
            mirror.enqueue(q.dequeue());
        return mirror;
    }
    static boolean anagrams(String a, String b) {
        Queue one = new Queue(a.length());
        Queue two = new Queue(b.length());
        for (int i = 0; i < a.length(); i++)
            one.enqueue(a.charAt(i));
        for (int i = 0; i < b.length(); i++)
            two.enqueue(b.charAt(i));
        while (!one.isEmpty()) {
            int i;
            for (i = 0; i < two.size(); i++) {
                if (one.peek() == two.peek()) {
                    i--; one.dequeue(); two.dequeue(); break;
                }
                two.enqueue(two.dequeue());
            }
            if (i == two.size()) return false;
            one.enqueue(one.dequeue());
        }
        return one.isEmpty() && two.isEmpty();
    }
    static void shiftTheZeros(Queue q) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            if ((int) q.peek() == 0) q.dequeue();
            else q.enqueue(q.dequeue());
        }
        for (int i = q.size(); i < size; i++)
            q.enqueue(0);
    }
    public static int timeTaken(Queue tickets, int k) {
        int seconds = 0, count = 0;
        while (true) {
            count = count % tickets.size();
            if (count == k && (int) tickets.peek() - 1 == 0) {
                seconds++;
                break;
                }
            if ((int) tickets.peek() == 0)
                tickets.enqueue(tickets.dequeue());
            else {
                tickets.enqueue((int) tickets.dequeue() - 1);
                seconds++;
            }
            count++;
        }
        return seconds;
    }
}