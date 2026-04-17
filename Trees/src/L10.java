public class L10 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(30); t.insert(10);
        t.insert(24); t.insert(18);
        t.insert(18); t.insert(13);
        t.insert(30); t.insert(10);
        t.insert(24); t.insert(18);
        t.insert(32); t.insert(31);
        t.displayTree();
        Tree t2 = t.doubleVals();
        t2.displayTree();
    }
}