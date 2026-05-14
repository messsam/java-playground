package classes;

import java.util.ArrayList;

public final class RowCol {
    public static int[] indexToRowCol(int index) {
        int[] rowCol = new int[2];
        if (index < 10) rowCol[1] = index;
        else {
            int major = index / 10, minor = index % 10;
            rowCol[0] = major;
            rowCol[1] = major % 2 == 0? minor: Math.abs(minor - 9);
        }
        return rowCol;
    }
    public static void main(String[] args) {
        int[] arr = indexToRowCol(99);
        System.out.println(arr[0] + " " + arr[1]);
        ArrayList<Object> arrList = new ArrayList<>();
        arrList.add(3);
        arrList.add(3);
        System.out.println(arrList.size());
    }
}
