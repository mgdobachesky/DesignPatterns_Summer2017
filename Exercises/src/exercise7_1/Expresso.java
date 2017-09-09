package exercise7_1;

public class Expresso extends Beverage {
	public Expresso(Size size) {
		description = "Expresso";
		setSize(size);
	}
	
	public double cost() {
		return 1.99;
	}
	
}
