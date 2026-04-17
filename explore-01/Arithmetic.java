public class Arithmetic {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0; i < args.length; i++)
			arr[i] = Integer.parseInt(args[i]);

		int smallest = arr[0], largest = arr[0], Sposition = 0, Lposition = 0;
		double sum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > largest) { largest = arr[i]; Lposition = i; }
			else if (arr[i] < smallest) { smallest = arr[i]; Sposition = i; }
		}

		System.out.print("Smallest: "+smallest+", at position "+Sposition+"\nLargest: "
			+largest+", at position "+Lposition+"\nAverage: "+sum/arr.length);
	}
}