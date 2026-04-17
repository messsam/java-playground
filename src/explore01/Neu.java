package explore01;

public class Neu {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 7, 3, 78, 3, 5, 3, 4, 56 ,33 , 5, 6, 3, 3};
		display(swapConsecutive(arr));
 	}
 	public static int[] swapConsecutive(int[] arr) {
 		int[] newArr = new int[arr.length];
 		for (int i = 1; i < arr.length; i += 2) {
 			if ((arr[i] + arr[i-1])%2 == 0) { newArr[i] = arr[i-1]; newArr[i-1] = arr[i]; }
 			else { newArr[i] = arr[i]; newArr[i-1] = arr[i-1]; }
 		}
 		return newArr;
 	}
 	public static void display(int[] arr) {
 		for (int i = 0; i < arr.length; i++) {
 			if (i == arr.length-1) System.out.print(arr[i]);
 			else System.out.print(arr[i] + ", ");
 		}
 	}
}