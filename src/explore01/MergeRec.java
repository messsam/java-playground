public class MergeRec {
	public static void main(String[] args) {
		int[] a = {1,8,3,4};
		int[] b = {5,2};
		mergeRec(a,b);
	}
	public static void mergeRec(int[] a, int[] b) {
		helper(a, b, 0);
	}
	public static void helper(int[] a, int[] b, int i) {
		if (i >= a.length && i >= b.length) return;
		if (i >= a.length) System.out.print(b[i] + " ");
		else if (i >= b.length) System.out.print(a[i] + " ");
		else System.out.print(a[i] + " " + b[i] + " ");
		helper(a, b, ++i);
	}
}