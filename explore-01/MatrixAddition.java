class MatrixAddition {
	public static void main(String[] args) {
		double[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		double[][] arr2 = {{2,4,6,8},{10,12,14,16},{18,20,22,24},{26,28,30,32}};
		double[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.print(isSum(arr1, arr2, arr3));
	}
	public static boolean isSum(double[][] arr1, double[][] arr2, double[][] arr3) {
		if (!sameLength(arr1, arr2, arr3)) return false;
		if (equal(sum(arr1, arr2), arr3)) return true;
		if (equal(sum(arr1, arr3), arr2)) return true;
		return (equal(sum(arr2, arr3), arr1));
	}
	public static boolean equal(double[][] arr1, double[][] arr2) {
		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr1[i].length; j++)
				if (arr1[i][j] != arr2[i][j]) return false;
		return true;
	}
	public static double[][] sum(double[][] arr1, double[][] arr2) {
		double[][] sum = new double[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr1[i].length; j++)
				sum[i][j] = arr1[i][j] + arr2[i][j];
		return sum;
	}
	public static boolean sameLength(double[][] arr1, double[][] arr2, double[][] arr3) {
		if (arr1.length != arr2.length || arr1.length != arr3.length) return false;
		if (arr1[0].length != arr2[0].length || arr1[0].length != arr3[0].length) return false;
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i].length != arr1[0].length ||
				arr2[i].length != arr2[0].length ||
					arr3[i].length != arr3[0].length)
						return false;
		return true;
	}
}