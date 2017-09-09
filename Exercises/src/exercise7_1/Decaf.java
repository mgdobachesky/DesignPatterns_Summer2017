package exercise7_1;

public class Decaf extends Beverage {
	public Decaf(Size size) {
		description = "Decaf coffee";
		setSize(size);
	}
	
	public double cost() {
		return 1.05;
	}
	
}
