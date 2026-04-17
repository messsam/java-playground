public class Print {
	public static void main(String[] args) {
		int[] arr1 = {3,1,5,6,78,4,2,4};
		int[] arr2 = {7,5,3,4,56};
		display(arr1, arr2);
	}
	public static void display(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length || i < arr2.length; i++) {
			if(i >= arr1.length) System.out.print(arr2[i]+" ");
			if(i >= arr2.length) System.out.print(arr1[i]+" ");
			else System.out.print(arr1[i]+" "+arr2[i]+" ");
		}
	}
}