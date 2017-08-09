package factoryMethodPattern;

// Concrete Product

public class Viola extends Instrument {
	public Viola() {
		this.setType("Viola");
		this.setRange("C3-E6");
		this.setColor("Brown");
		this.setTone("Warm");
		this.setAge(25);
	}
}
