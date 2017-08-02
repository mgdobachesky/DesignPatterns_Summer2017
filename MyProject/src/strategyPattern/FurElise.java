package strategyPattern;

public class FurElise implements PieceOfMusic {
	// Properties
	private String composer;
	
	// Constructors
	public FurElise() {
		composer = "Ludwig van Beethoven";
	}
	
	// Getters and Setters
	public String getComposer() {
		return composer;
	}

	// Interface Implementation
	public void playMusic() {
		System.out.println("<< Fur Elise >>");
	}
}
