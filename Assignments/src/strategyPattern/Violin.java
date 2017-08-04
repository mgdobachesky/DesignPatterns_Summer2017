package strategyPattern;

public class Violin extends Instrument {
	public Violin() {
		type = "String";
		range = "G3-A7";
		color = "Dark Brown";
		tone = "Rich";
		age = "30 years";
		pieceOfMusic = new NoPiece();
	}
	
	public void instrumentInfo() {
		System.out.println("~Violin~");
		System.out.println("Type: " + type);
		System.out.println("Range: " + range);
		System.out.println("Color: " + color);
		System.out.println("Tone: " + tone);
		System.out.println("Age: " + age);
	}
}
