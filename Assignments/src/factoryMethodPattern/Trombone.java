package factoryMethodPattern;

// Concrete Product

public class Trombone extends Instrument {
	public Trombone() {
		this.setType("Trombone");
		this.setRange("E2-F5");
		this.setColor("Golden");
		this.setTone("Brassy");
		this.setAge(15);
	}
}
