package quest2;

public class NoPiece implements PieceOfMusic {
	// Properties
	private String composer;
	
	// Constructors
	public NoPiece() {
		composer = "";
	}
	
	// Getters and Setters
	public String getComposer() {
		return composer;
	}

	// Interface Implementation
	public void playMusic() {
		System.out.println("Nothing to play!");
	}
}
