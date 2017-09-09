package exercise7_1;

public abstract class Beverage {
	public enum Size {TALL, GRANDE, VENTI;}
	String description = "Unknown Beverage";
	Size beverageSize;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public Size getSize() {
		return beverageSize;
	}
	
	public void setSize(Size size) {
		this.beverageSize = size;
	}
}
