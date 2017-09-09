package exercise7_1;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public Size getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		switch(beverage.getSize()) {
		case TALL:
			return beverage.cost() + .05;
		case GRANDE:
			return beverage.cost() + .10;
		case VENTI:
			return beverage.cost() + .15;
		default:
			return beverage.cost() + .10;
		}
	}
}
