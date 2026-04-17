package explore01;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = {{1}, {2,2}, {3,3,3}, {4,4,4,4}, {5,5,5,5,5}};
        System.out.print(isPatternSequence(array));
    }
    public static boolean isPatternSequence(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i+1 != arr[i].length) return false;
            for (int j : arr[i])
                if (j != i+1) return false;
        }
        return true;
    }
}