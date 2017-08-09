package factoryMethodPattern;

// Concrete Product

public class Violin extends Instrument {
	public Violin() {
		this.setType("Violin");
		this.setRange("G3-A7");
		this.setColor("Brown");
		this.setTone("Ethereal");
		this.setAge(30);
	}
}
