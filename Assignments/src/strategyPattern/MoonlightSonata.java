package strategyPattern;

public class MoonlightSonata implements PieceOfMusic {
	// Properties
	private String composer;
	
	// Constructors
	public MoonlightSonata() {
		composer = "Ludwig van Beethoven";
	}
	
	// Getters and Setters
	public String getComposer() {
		return composer;
	}

	// Interface Implementation
	public void playMusic() {
		System.out.println("<< Moonlight Sonata >>");
	}
}
