public class PracticeArrays {
	public static void main(String[] args) {
		int[][] arr = {{43,67,345,3241,123},{23,45,57,78,678},{345,67,63,345,24},{342,546,645,657,5},{2,3,45,4,2}};
		display(getColumn(arr, 3));
		display(triangle(5));
	}
	public static int[][] getColumn(int[][] arr, int x) {
		int[][] newArr = new int[arr.length][1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i][0] = arr[i][x];
		}
		return newArr;
	}
	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			display(arr[i]);
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) System.out.println(arr[i]);
			else System.out.print(arr[i] + ", ");
		}
	}
	public static int[][] triangle(int x) {
		int[][] arr = new int[x][];
		for (int i = 0; i < x; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = j+1;
		}
		return arr;
	}
}