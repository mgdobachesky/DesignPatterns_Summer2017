package factoryMethodPattern;

// Concrete Product

public class Cello extends Instrument {
	public Cello() {
		this.setType("Cello");
		this.setRange("C2-C6");
		this.setColor("Brown");
		this.setTone("Deep");
		this.setAge(27);
	}
}
