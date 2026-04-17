import java.util.Scanner;
public class T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();
		int[] arr = {11, 33, 55, 87, 3, 6, 342, 67, 4, 7, -2, 18};
		System.out.print(closestToTarget(arr, x));
	}
	public static int closestToTarget(int[] arr, int x) {
		int closest = arr[0]; int diff = diff(x, arr[0]);
		for (int i = 1; i < arr.length; i++)
			if (diff(x, arr[i]) < diff) {
				diff = diff(x, arr[i]);
				closest = arr[i];
			}
		return closest;
	}
	public static int diff(int x, int y) {
		if (x - y < 0) return -(x - y);
		else return x - y;
	}
}