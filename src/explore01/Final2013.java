package explore01;

public class Final2013 {
	public static double absoluteDifference(double[] arr) {
		double absoluteDiff = Double.POSITIVE_INFINITY;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (i != j && Math.abs(arr[i] - arr[j]) < absoluteDiff)
					absoluteDiff = Math.abs(arr[i] - arr[j]);
		return absoluteDiff;
	}
	public static void main(String[] args) {
		double[] array = {4.5, 3.5, 6.0, 20.0, 3.0};
		System.out.print(absoluteDifference(array));
	}
}