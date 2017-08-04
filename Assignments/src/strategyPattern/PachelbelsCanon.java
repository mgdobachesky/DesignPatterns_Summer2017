package strategyPattern;

public class PachelbelsCanon implements PieceOfMusic {
	// Properties
	private String composer;
	
	// Constructors
	public PachelbelsCanon() {
		composer = "Johann Pachelbel";
	}
	
	// Getters and Setters
	public String getComposer() {
		return composer;
	}

	// Interface Implementation
	public void playMusic() {
		System.out.println("<< Pachelbel's Canon >>");
	}
}
