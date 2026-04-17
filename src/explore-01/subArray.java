public class subArray {
	public static void main(String[] args) {
		int[][] arr = {{5,3,7,9,4}, {1,4,7,4,0}, {8,4,2,6,2}, {5,9,3,5,9}, {4,3,7,9,2}};
		display(subArray(arr));
	}
	public static int[] subArray(int[][] arr) {
		int[] newArr = new int[arr.length];
		int j = arr[0].length-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] > arr[i][j]) { newArr[i] = arr[i][i]; j--; }
			else newArr[i] = arr[i][j--];
		}
		return newArr;
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}