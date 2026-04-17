package dsa.trees;

public class Tree {
    private Node root;

    public void insert(Comparable data) {
        if (root == null) { root = new Node(data); return; }
        Node curr = root;
        while (true) {
            if (curr.data.compareTo(data) > 0) {
                if (curr.left == null) { curr.left = new Node(data); return; }
                curr = curr.left;
            } else {
                if (curr.right == null) { curr.right = new Node(data); return; }
                curr = curr.right;
            }
        }
    }
    public boolean delete(Comparable key) {
        Node curr = root, parent = root;
        while (curr != null) {
            if (curr.data.compareTo(key) == 0) {
                if (curr == parent) {
                    if (curr.left == null && curr.right == null) root = null;
                    else if (curr.left == null) root = curr.right;
                    else if (curr.right == null) root = curr.left;
                    else {
                        root = curr.left;
                        Node temp = root;
                        while (temp.right != null) temp = temp.right;
                        temp.right = curr.right;
                    }
                }
                else if (curr.left == null && curr.right == null) {
                    if (curr == parent.left) parent.left = null;
                    else parent.right = null;
                } else if (curr.left == null) {
                    if (curr == parent.left) parent.left = curr.right;
                    else parent.right = curr.right;
                } else if (curr.right == null) {
                    if (curr == parent.left) parent.left = curr.left;
                    else parent.right = curr.left;
                } else {
                    Node temp = curr.left;
                    while (temp.right != null) temp = temp.right;
                    if (curr == parent.left) parent.left = curr.left;
                    else parent.right = curr.left;
                    temp.right = curr.right;
                }
                return true;
            } else {
                parent = curr;
                if (curr.data.compareTo(key) > 0) curr = curr.left;
                else curr = curr.right;
            }
        }
        return false;
    }
    public Node find(Comparable key) {
        Node curr = root;
        while (curr != null && curr.data.compareTo(key) != 0)
            if (curr.data.compareTo(key) > 0) curr = curr.left;
            else curr = curr.right;
        return curr;
    }
    public boolean isEmpty() { return root == null; }
    public void displayTree() {
        java.util.Stack<Node> globalStack = new java.util.Stack<Node>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        while(!isRowEmpty) {
            java.util.Stack<Node> localStack = new java.util.Stack<Node>();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(' ');
            while(!globalStack.isEmpty()) {
                Node temp = globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if(temp.left != null || temp.right != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                } for(int j=0; j<nBlanks*2-2; j++)
                    System.out.print(' ');
            }  // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while(!localStack.isEmpty())
                globalStack.push( localStack.pop() );
        }  // end while isRowEmpty is false
        System.out.println();
    }

    private static class Node {
        Comparable data;
        Node left, right;
        @Override
        public String toString() { return data.toString(); }
        public Node(Comparable data) { this(data, null, null); }
        public Node(Comparable data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    // Additions. (PA)
    public Node findRec(Comparable key) { return findHelper(root, key); }
    private Node findHelper(Node curr, Comparable key) {
        if (curr == null) return null;
        if (curr.data.compareTo(key) == 0) return curr;
        if (curr.data.compareTo(key) > 0) return findHelper(curr.left, key);
        return findHelper(curr.right, key);
    }
    public int level(Comparable key) {
        int count = 0;
        for (Node curr = root; curr != null; count++) {
            if (curr.data.compareTo(key) == 0) return count;
            if (curr.data.compareTo(key) > 0) curr = curr.left;
            else curr = curr.right;
        }
        return -1;
    }
    public int levelRec(Comparable key) { return levelHelper(root, 0, key); }
    public int levelHelper(Node curr, int count, Comparable key) {
        if (curr == null) return -1;
        if (curr.data.compareTo(key) == 0) return count;
        if (curr.data.compareTo(key) > 0) return levelHelper(curr.left, count+1, key);
        return levelHelper(curr.right, count+1, key);
    }
    public Comparable largestElement() {
        if (isEmpty()) return null;
        Node largest = root;
        while (largest.right != null)
            largest = largest.right;
        return largest.data;
    }
    public int heightRec() { return heightHelper(root, 0); }
    public int heightHelper(Node curr, int height) {
        if (curr == null) return height;
        int leftHeight = heightHelper(curr.left, height+1);
        int rightHeight = heightHelper(curr.right, height+1);
        return Math.max(leftHeight, rightHeight);
    }
    public int size() { return sizeHelper(root); }
    public int sizeHelper(Node curr) {
        if (curr == null) return 0;
        return 1 + sizeHelper(curr.left) + sizeHelper(curr.right);
    }
    public int numOfLeaves() { return leavesHelper(root); }
    public int leavesHelper(Node curr) {
        if (curr == null) return 0;
        if (curr.left == null && curr.right == null) return 1;
        return leavesHelper(curr.left) + leavesHelper(curr.right);
    }
    public int sum() { return sumHelper(root); }
    public int sumHelper(Node curr) {
        if (curr == null) return 0;
        return (int) curr.data + sumHelper(curr.left) + sumHelper(curr.right);
    }
    public boolean isBST() { return BSTHelper(root); }
    public boolean BSTHelper(Node curr) {
        if (curr == null) return true;
        if (curr.left != null && curr.data.compareTo(maximumHelper(curr.left)) < 0) return false;
        if (curr.right != null && curr.data.compareTo(minimumHelper(curr.right)) > 0) return false;
        return BSTHelper(curr.left) && BSTHelper(curr.right);
    }
    public int maximum() { return maximumHelper(root); }
    private int maximumHelper(Node curr) {
        if (curr == null) return -1;
        int left = maximumHelper(curr.left);
        int right = maximumHelper(curr.right);
        return Math.max((int)curr.data, Math.max(left, right));
    }
    public int minimum() { return minimumHelper(root); }
    private int minimumHelper(Node curr) {
        if (curr == null) return -1;
        int left = minimumHelper(curr.left);
        int right = minimumHelper(curr.right);
        return Math.min((int)curr.data, Math.min(left, right));
    }
    public int numLeftChildNodes() { return leftHelper(root); }
    public int leftHelper(Node curr) {
        if (curr == null) return 0;
        if (curr.right == null && curr.left != null)
            return 1 + leftHelper(curr.left);
        return leftHelper(curr.left) + leftHelper(curr.right);
    }
    public int countOccur(Comparable key) { return countHelper(root, key); }
    public int countHelper(Node curr, Comparable key) {
        if (curr == null) return 0;
        if (curr.data.compareTo(key) == 0)
            return 1 + countHelper(curr.left, key) + countHelper(curr.right, key);
        return countHelper(curr.left, key) + countHelper(curr.right, key);
    }
    public boolean hasDups(Comparable key) {
        return dupsHelper(root, key); // return dupsHelper2(key);
    }
    public boolean dupsHelper(Node curr, Comparable key) {
        if (curr == null) return false;
        if (curr.data.compareTo(key) == 0) return true;
        return dupsHelper(curr.left, key) || dupsHelper(curr.right, key);
    }
    public boolean dupsHelper2(Comparable key) {
        if (countOccur(key) >= 2) return true;
        return false;
    }
    public boolean occur(Comparable key) { return occurHelper(root, key); }
    public boolean occurHelper(Node curr, Comparable key) {
        if (curr == null) return false;
        if (curr.data.compareTo(key) == 0) return true;
        return occurHelper(curr.left, key) || occurHelper(curr.right, key);
    }
    public void mirror() { mirrorHelper(root); }
    public void mirrorHelper(Node curr) {
        if (curr == null) return;
        Node temp = curr.right;
        curr.right = curr.left;
        curr.left = temp;
        mirrorHelper(curr.left);
        mirrorHelper(curr.right);
    }
    public String oddNodes() { return oddHelper(root); }
    public String oddHelper(Node curr) {
        if (curr == null) return "";
        if ((int) curr.data % 2 == 1)
            return curr.data + " " + oddHelper(curr.left) + oddHelper(curr.right);
        return oddHelper(curr.left) + oddHelper(curr.right);
    }
    public void deleteLeaves() {
        if (root.left == null && root.right == null)
            root = null;
        else leavDelHelper(root);
    }
    public void leavDelHelper(Node curr) {
        if (curr == null) return;
        if (isLeaf(curr.left)) curr.left = null;
        if (isLeaf(curr.right)) curr.right = null;
        leavDelHelper(curr.left);
        leavDelHelper(curr.right);
    }
    public boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }
    public void printLevel(int level) { levHelper(root, level, 0); }
    public void levHelper(Node curr, int level, int currLev) {
        if (curr == null) return;
        if (level == currLev)
            System.out.print(curr.data+" ");
        currLev++;
        levHelper(curr.left, level, currLev);
        levHelper(curr.right, level, currLev);
    }
    public void descendingOrder() {
        System.out.print(descendingHelper(root));
    }
    public String descendingHelper(Node curr) {
        if (curr == null) return "";
        return descendingHelper(curr.right) + " " + curr.data + " " + descendingHelper(curr.left);
    }
    public void orderedDisplay() {
        System.out.print(orderedHelper(root));
    }
    public String orderedHelper(Node curr) {
        if (curr == null) return "";
        return orderedHelper(curr.left) + " " + curr.data + orderedHelper(curr.right);
    }
    public Tree doubleVals() {
        Tree res = new Tree();
        doubleHelper(root, res);
        return res;
    }
    public void doubleHelper(Node curr, Tree res) {
        if (curr == null) return;
        res.insert((int)curr.data*2);
        doubleHelper(curr.left, res);
        doubleHelper(curr.right, res);
    }
}