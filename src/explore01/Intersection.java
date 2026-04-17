public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = {12, 32, 14, 35, 89, 16, 120};
		int[] arr2 = {9, 12, 8, 17, 120, 35, 36};
		System.out.print("Union: "); display(union(arr1, arr2));
		System.out.print("Intersection: "); display(intersection(arr1, arr2));
	}
	public static int[] intersection(int[] arr1, int[] arr2) {
		int count = 0, j = 0;
		int[] union = union(arr1, arr2);
		for (int i = 0; i < union.length; i++)
			if (exist(union[i], arr1) && exist(union[i], arr2))
				count++;
		int[] intersection = new int[count];
		for (int i = 0; i < union.length; i++)
			if (exist(union[i], arr1) && exist(union[i], arr2))
				intersection[j++] = union[i];
		return intersection;
	}
	public static int[] union(int[] arr1, int[] arr2) {
		int additionals = 0, i = 0;
		for (int j : arr2)
			if (!exist(j, arr1))
				additionals++;
		int[] union = new int[arr1.length+additionals];
		for (; i < arr1.length; i++)
			union[i] = arr1[i];
		for (int j = 0; j < arr2.length; j++)
			if (!exist(arr2[j], arr1))
				union[i++] = arr2[j];
		return union;

	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) System.out.println(arr[i]);
			else System.out.print(arr[i] + ", ");
		}
	}
	public static boolean exist(int x, int[] arr) {
		for (int i : arr)
			if (i == x) return true;
		return false;
	}
}