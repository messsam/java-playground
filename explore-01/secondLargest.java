public class secondLargest {
	public static void main(String[] args) {
		int[] arr = {2,5,4,56,4234,6757,35,656,788};
		System.out.print(getSecondLargest(arr));
	}
	public static int getSecondLargest(int[] arr) {
		int largest = arr[0], secondLargest = -1;
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > largest) largest = arr[i];
		for (int i = 0; i < arr.length; i++)
			if (largest - arr[i] < largest - secondLargest && largest - arr[i] != 0)
				secondLargest = arr[i];
		return secondLargest;
	}
}