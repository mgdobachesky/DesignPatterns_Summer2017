package factoryMethodPattern;

// Concrete Product

public class Trumpet extends Instrument {
	public Trumpet() {
		this.setType("Trumpet");
		this.setRange("F#3-D6");
		this.setColor("Golden");
		this.setTone("Piercing");
		this.setAge(12);
	}
}
