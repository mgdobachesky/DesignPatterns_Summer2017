package factoryMethodPattern;

// Concrete Product

public class Tuba extends Instrument {
	public Tuba() {
		this.setType("Tuba");
		this.setRange("D1-F4");
		this.setColor("Golden");
		this.setTone("Boomy");
		this.setAge(21);
	}
}
