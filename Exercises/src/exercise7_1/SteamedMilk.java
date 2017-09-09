package exercise7_1;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
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
