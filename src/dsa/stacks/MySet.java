package dsa.stacks;

public class MySet {
    Integer[] set = new Integer[100];
    int top = -1;

    // O(1)
    public MySet() {}
    // O(1)
    public int cardinality() { return top+1; }
    // O(n)
    public void insert(int element) {
        if (cardinality() != 100) {
            if (contains(element)) {
                System.out.print("Invalid. (Duplicate)");
                return;
            }
        set[++top] = element;
        }
        else System.out.print("Invalid. (Full)");
    }
    // O(n)
    public void remove(int element) {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++)
                if (set[i] == element) {
                    while (i < cardinality()-1) {
                        set[i] = set[i+1]; i++;
                    }
                    System.out.print("Successfully deleted.");
                    top--; return;
                }
            System.out.print("Invalid (Not found)");
        }
        else System.out.print("Invalid (Empty)");
    }
    // O(n)
    public boolean contains(int element) {
        for (int i = 0; i < cardinality(); i++)
            if (set[i] == element) return true;
        return false;
    }
    // O(n)
    public void replace(int x, int y) {
        for (int i = 0; i <= top; i++)
            if (set[i] == x) {
                set[i] = y; return;
            }
        insert(y);
    }
    // O(1)
    public boolean isEmpty() { return top == -1; }
}