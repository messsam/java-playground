public class Print {
    public static void main(String[] args) {
        int[] arr1 = {3,1,5,6,78,4,2,4};
        int[] arr2 = {7,5,3,4,56};
        print(display2(arr1, arr2));
        display1(arr1, arr2);
    }
    public static void display1(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length || i < arr2.length; i++) {
            if(i >= arr1.length) System.out.print(arr2[i]+", ");
            if(i >= arr2.length) System.out.print(arr1[i]+", ");
            else System.out.print(arr1[i]+", "+arr2[i]+", ");
        }
    }
    public static int[] display2(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+arr2.length]; int j = 0;
        for(int i = 0; i < arr1.length || i < arr2.length; i++) {
            if(i >= arr1.length) arr[j++] = arr2[i];
            if(i >= arr2.length) arr[j++] = arr1[i];
            else { arr[j++] = arr1[i]; arr[j++] = arr2[i]; }
        }
        return arr;
    }
    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i]+", ");
        }
    }
}