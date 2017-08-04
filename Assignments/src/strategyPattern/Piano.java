package strategyPattern;

public class Piano extends Instrument {
	public Piano() {
		type = "Percussion";
		range = "A0-C8";
		color = "Black";
		tone = "Full";
		age = "10 years";
		pieceOfMusic = new NoPiece();
	}
	
	public void instrumentInfo() {
		System.out.println("~Piano~");
		System.out.println("Type: " + type);
		System.out.println("Range: " + range);
		System.out.println("Color: " + color);
		System.out.println("Tone: " + tone);
		System.out.println("Age: " + age);
	}
}
