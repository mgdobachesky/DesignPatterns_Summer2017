package strategyPattern;

public class InstrumentSimulator {

	public static void main(String[] args) {
		// Play the piano
		Instrument piano = new Piano();
		piano.instrumentInfo();
		piano.playMusic();
		piano.setPiece(new MoonlightSonata());
		piano.playMusic();
		piano.setPiece(new FurElise());
		piano.playMusic();
		
		System.out.println();
		
		// Play the violin
		Instrument violin = new Violin();
		violin.instrumentInfo();
		violin.playMusic();
		violin.setPiece(new PachelbelsCanon());
		violin.playMusic();
	}

}
