package explore01;

public class Rechtangle {
	double width, height;
	boolean isSquare = false;

	public Rechtangle(double width, double height) {
		this.width = width;
		this.height = height;
		if (width == height)
			isSquare = true;
	}

	public boolean contains(Rechtangle b) {
		return width >= b.width && height >= b.height;
	}

	public static void main(String[] args) {
		Rechtangle R1 = new Rechtangle(4, 2);
		Rechtangle R2 = new Rechtangle(7, 7);
		System.out.print(R2.contains(R1));
	}
}