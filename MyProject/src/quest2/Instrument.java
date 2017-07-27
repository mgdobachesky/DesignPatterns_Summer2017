package quest2;

public abstract class Instrument {
	// Properties
	protected String type;
	protected String range;
	protected String color;
	protected String tone;
	protected String age;
	protected PieceOfMusic pieceOfMusic;
	
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	// Methods
	public void playMusic() {
		pieceOfMusic.playMusic();
	}
	
	public void setPiece(PieceOfMusic newPiece) {
		pieceOfMusic = newPiece;
	}
	
	public abstract void instrumentInfo();

}
