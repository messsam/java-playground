package explore01;

public class Subset {
	public static void main(String[] args) {
		char[] pal = {'l','e','v','e','l'};
		int[] arr1 = {};
		int[] arr2 = {2,4,5,1};
		if (subset(arr1, arr2)) System.out.println("array 1 is a subset of array 2");
		else System.out.println("array 1 is not a subset of array 2");
		System.out.print(palindrome(pal));
	}
	public static boolean exist(int x, int[] arr) {
		for (int i : arr)
			if (i == x) return true;
		return false;
	}
	public static boolean subset(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++)
			if (!exist(arr1[i], arr2))
				return false;
		return true;
	}
	public static boolean palindrome(char[] arr) {
		int j = arr.length-1;
		for (int i = 0; i < j; i++)
			if (arr[i] != arr[j--])
				return false;
		return true;
	}
}