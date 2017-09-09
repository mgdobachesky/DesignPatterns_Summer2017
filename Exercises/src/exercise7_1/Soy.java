package exercise7_1;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public Size getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		switch(beverage.getSize()) {
		case TALL:
			return beverage.cost() + .10;
		case GRANDE:
			return beverage.cost() + .15;
		case VENTI:
			return beverage.cost() + .20;
		default:
			return beverage.cost() + .15;
		}
	}
}
