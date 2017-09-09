package exercise7_1;

public class DarkRoast extends Beverage {
	public DarkRoast(Size size) {
		description = "Dark Roast Coffee";
		setSize(size);
	}
	
	public double cost() {
		return .99;
	}
	
}
