package factoryMethodPattern;

// Abstract Product

public abstract class Instrument {
	// Properties
	private String type;
	private String range;
	private String color;
	private String tone;
	private int age;
	
	// Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTone() {
		return tone;
	}

	public void setTone(String tone) {
		this.tone = tone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void instrumentDetails() {
		System.out.println("Instrument Type: " + this.getType());
		System.out.println("Instrument Color: " + this.getColor());
		System.out.println("Instrument Age: " + this.getAge());
		System.out.println("Instrument Range: " + this.getRange());
		System.out.println("Instrument Tone: " + this.getTone());
	}
	
	public void buildInstrument() {
		System.out.println("Building " + this.getType() + "...");
		this.instrumentDetails();
		System.out.println("..." + this.getType() + " built!");
	}
	
	public void tuneInstrument() {
		System.out.println("Tuning " + this.getType() + "...");
		System.out.println("..." + this.getType() + " in tune!");
	}
	
	public void finishingTouches() {
		System.out.println("Finishing " + this.getType() + "...");
		System.out.println("..." + this.getType() + " has been created!");
	}
}
