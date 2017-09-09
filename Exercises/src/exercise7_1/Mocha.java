package exercise7_1;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public Size getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		switch(beverage.getSize()) {
		case TALL:
			return beverage.cost() + .15;
		case GRANDE:
			return beverage.cost() + .20;
		case VENTI:
			return beverage.cost() + .25;
		default:
			return beverage.cost() + .20;
		}
	}
}
