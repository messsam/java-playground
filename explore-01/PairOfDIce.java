public class PairOfDIce {
	int firstDice, secondDice;

	public PairOfDIce() { roll(); }
	public void roll() {
		firstDice = (int)((Math.random()*6)+1);
		secondDice = (int)((Math.random()*6)+1);
	}

	public int getFirstDice() { return firstDice; }
	public int getSecondDice() { return secondDice; }
	public int getTotal() { return firstDice + secondDice; }

	public static void main(String[] args) {
		PairOfDIce POD = new PairOfDIce(); int i;
		for (i = 1; POD.getTotal() != 2; i++) {
			POD.roll();
			System.out.println(POD.getFirstDice() + " " + POD.getSecondDice()); }
		System.out.print("The number of rolls is: " + i);
	}
}